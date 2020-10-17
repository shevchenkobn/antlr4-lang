package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.python;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoParser;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.OfpSourceCodeException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.Symbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.VariableSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.visitors.BaseOfpVisitor;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class PythonCodeGenerator extends BaseOfpVisitor<Void> {
    private static final List<Class> DECL_STATEMENTS_CLASSES = Arrays.asList(new Class[] {
            OfpPashaievaShevchenkoParser.IntDeclContext.class,
            OfpPashaievaShevchenkoParser.FloatDeclContext.class,
            OfpPashaievaShevchenkoParser.CharDeclContext.class,
            OfpPashaievaShevchenkoParser.BoolDeclContext.class,
            OfpPashaievaShevchenkoParser.StrDeclContext.class,
            OfpPashaievaShevchenkoParser.IntArrDeclContext.class,
            OfpPashaievaShevchenkoParser.FloatArrDeclContext.class,
            OfpPashaievaShevchenkoParser.CharArrDeclContext.class,
    });
    private static final List<Class> BLOCK_CLASSES = Arrays.asList(new Class[] {
            OfpPashaievaShevchenkoParser.BlockContext.class,
            OfpPashaievaShevchenkoParser.VoidBlockContext.class,
            OfpPashaievaShevchenkoParser.FuncBlockContext.class,
    });

    private final PythonIdController idController;
    private final Appendable output;
    private int depth = 0;
    private final Map<Integer,String> indentCache = new HashMap<>();
    private OfpPashaievaShevchenkoParser.MainDefContext main;
    private FunctionSymbol functionSymbol;
    private Scope<VariableSymbol> currentScope;

    public PythonCodeGenerator(Scope<FunctionSymbol> globalScope, Appendable output) {
        super(globalScope);
        idController = new PythonIdController(globalScope.size());
        for (var function : globalScope.getSymbols()) {
            idController.defineFunction(function.getName());
        }
        this.output = output;
    }

    @Override
    public Void visitProgramDef(OfpPashaievaShevchenkoParser.ProgramDefContext ctx) {
        visitChildren(ctx);
        visitMainDef(main);
        return null;
    }

    @Override
    public Void visitMainDef(OfpPashaievaShevchenkoParser.MainDefContext ctx) {
        if (main == null) {
            main = ctx;
            return null;
        }
        depth = 0;
        functionSymbol = globalScope.resolve("main");
        currentScope = functionSymbol.getVariableScope();
        idController.enterScope();
        visitChildren(main.voidBlock());
        idController.exitScope();
        functionSymbol = null;
        currentScope = null;
        return null;
    }

    @Override
    public Void visitFuncDef(OfpPashaievaShevchenkoParser.FuncDefContext ctx) {
        try {
            appendFunction(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException(String.format("failed to write function '%s': %s",
                    ctx.ID().getText(), exception.getMessage()), exception));
        }
        return null;
    }

    @Override
    public Void visitVoidFuncDef(OfpPashaievaShevchenkoParser.VoidFuncDefContext ctx) {
        try {
            appendFunction(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException(String.format("failed to write function '%s': %s",
                    ctx.ID().getText(), exception.getMessage()), exception));
        }
        return null;
    }

    @Override
    public Void visitFuncArgs(OfpPashaievaShevchenkoParser.FuncArgsContext ctx) {
        try {
            for (var argument : functionSymbol.getArguments()) {
                idController.defineVariable(argument.getName());
            }
            output.append('(').append(Arrays.stream(functionSymbol.getArguments())
                    .map(Symbol::getName).map(idController::resolveVariable)
                    .collect(Collectors.joining(", "))).append("):\n");
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException(String.format("failed to write function args for '%s': %s",
                    functionSymbol.getName(), exception.getMessage()), exception));
        }
        return null;
    }

    @Override
    public Void visitFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx) {
        try {
            appendBlock(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write code block: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx) {
        try {
            appendBlock(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write code block: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitBlock(OfpPashaievaShevchenkoParser.BlockContext ctx) {
        try {
            appendBlock(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write code block: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitIfDef(OfpPashaievaShevchenkoParser.IfDefContext ctx) {
        try {
            appendIfDef(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write if statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitVoidIfDef(OfpPashaievaShevchenkoParser.VoidIfDefContext ctx) {
        try {
            appendIfDef(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write if statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitWhileDef(OfpPashaievaShevchenkoParser.WhileDefContext ctx) {
        try {
            appendWhileDef(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write while statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitVoidWhileDef(OfpPashaievaShevchenkoParser.VoidWhileDefContext ctx) {
        try {
            appendWhileDef(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write while statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitScStat(OfpPashaievaShevchenkoParser.ScStatContext ctx) {
        try {
            appendScStat(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitReturnExpr(OfpPashaievaShevchenkoParser.ReturnExprContext ctx) {
        try {
            output.append("return ");
            visitExpr(ctx.expr());
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write return statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitVoidScStat(OfpPashaievaShevchenkoParser.VoidScStatContext ctx) {
        try {
            appendScStat(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitAssign(OfpPashaievaShevchenkoParser.AssignContext ctx) {
        try {
            appendAssign(ctx.ID().getText(), ctx.expr());
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write assignment: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitArrSet(OfpPashaievaShevchenkoParser.ArrSetContext ctx) {
        try {
            visitVariable(ctx.variable(0));
            output.append('[');
            visit(ctx.getChild(2));
            output.append("] = ");
            visit(ctx.getChild(5));
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write array set: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitFuncCall(OfpPashaievaShevchenkoParser.FuncCallContext ctx) {
        var functionName = ctx.ID().getText();
        try {
            output.append(idController.resolveFunction(functionName))
                    .append('(');
            var expressions = ctx.expr();
            for (int i = 0; i < expressions.size(); i += 1) {
                if (i > 0) {
                    output.append(", ");
                }
                visitExpr(expressions.get(i));
            }
            output.append(')');
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException(String.format("failed to write function '%s' call: %s", functionName, exception.getMessage()),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitPrintExpr(OfpPashaievaShevchenkoParser.PrintExprContext ctx) {
        try {
            output.append("print(");
            visitPrintable(ctx.printable());
            output.append(", end='')");
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write print statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitPrintlnExpr(OfpPashaievaShevchenkoParser.PrintlnExprContext ctx) {
        try {
            output.append("print(");
            visitPrintable(ctx.printable());
            output.append(')');
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write println statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitBoolExpr(OfpPashaievaShevchenkoParser.BoolExprContext ctx) {
        try {
            if (ctx.LRB() != null) {
                output.append('(');
                visitBoolExpr(ctx.boolExpr(0));
                output.append(')');
            } if (ctx.EQ() != null) {
                visit(ctx.getChild(0));
                output.append(" == ");
                visit(ctx.getChild(2));
            } if (ctx.GT() != null) {
                visit(ctx.getChild(0));
                output.append(" > ");
                visit(ctx.getChild(2));
            } if (ctx.LT() != null) {
                visit(ctx.getChild(0));
                output.append(" < ");
                visit(ctx.getChild(2));
            } if (ctx.TRUE() != null) {
                output.append("True");
            } if (ctx.FALSE() != null) {
                output.append("False");
            } else {
                visit(ctx.getChild(0));
            }
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write bool expression: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitIntExpr(OfpPashaievaShevchenkoParser.IntExprContext ctx) {
        try {
            var hasUnaryMinus = ctx.MINUS() == ctx.getChild(0);
            if (hasUnaryMinus) {
                output.append('-');
            }
            if (ctx.LRB() != null) {
                output.append('(');
                visitIntExpr(ctx.intExpr(0));
                output.append(')');
            } else if (ctx.MULT() != null) {
                visitIntExpr(ctx.intExpr(0));
                output.append(" * ");
                visitIntExpr(ctx.intExpr(1));
            } else if (ctx.DIV() != null) {
                visitIntExpr(ctx.intExpr(0));
                output.append(" // ");
                visitIntExpr(ctx.intExpr(1));
            } else if (ctx.PLUS() != null) {
                visitIntExpr(ctx.intExpr(0));
                output.append(" + ");
                visitIntExpr(ctx.intExpr(1));
            } else if (ctx.MINUS() != null) {
                visitIntExpr(ctx.intExpr(0));
                output.append(" - ");
                visitIntExpr(ctx.intExpr(1));
            } else {
                var literal = ctx.intLiteral();
                if (literal != null) {
                    output.append(literal.getText());
                } else {
                    visit(ctx.getChild(hasUnaryMinus ? 1 : 0));
                }
            }
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write int expression: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitFloatExpr(OfpPashaievaShevchenkoParser.FloatExprContext ctx) {
        try {
            var hasUnaryMinus = ctx.MINUS() == ctx.getChild(0);
            if (hasUnaryMinus) {
                output.append('-');
            }
            if (ctx.LRB() != null) {
                output.append('(');
                visitFloatExpr(ctx.floatExpr(0));
                output.append(')');
            } else if (ctx.MULT() != null) {
                visitFloatExpr(ctx.floatExpr(0));
                output.append(" * ");
                visitFloatExpr(ctx.floatExpr(1));
            } else if (ctx.DIV() != null) {
                visitFloatExpr(ctx.floatExpr(0));
                output.append(" / ");
                visitFloatExpr(ctx.floatExpr(1));
            } else if (ctx.PLUS() != null) {
                visitFloatExpr(ctx.floatExpr(0));
                output.append(" + ");
                visitFloatExpr(ctx.floatExpr(1));
            } else if (ctx.MINUS() != null) {
                visitFloatExpr(ctx.floatExpr(0));
                output.append(" - ");
                visitFloatExpr(ctx.floatExpr(1));
            } else {
                var literal = ctx.floatLiteral();
                if (literal != null) {
                    output.append(literal.getText());
                } else {
                    visit(ctx.getChild(hasUnaryMinus ? 1 : 0));
                }
            }
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write float expression: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitStrExpr(OfpPashaievaShevchenkoParser.StrExprContext ctx) {
        try {
            var literal = ctx.STRING();
            if (literal != null) {
                output.append(literal.getText());
            } else {
                visit(ctx.getChild(0));
            }
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write string expression: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitCharExpr(OfpPashaievaShevchenkoParser.CharExprContext ctx) {
        try {
            var literal = ctx.QUOTED_CHAR();
            if (literal != null) {
                output.append(literal.getText());
            } else {
                visit(ctx.getChild(0));
            }
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write char expression: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitIntArr(OfpPashaievaShevchenkoParser.IntArrContext ctx) {
        try {
            output.append('[');
            var expressions = ctx.intExpr();
            for (int i = 0; i < expressions.size(); i += 1) {
                if (i > 0) {
                    output.append(", ");
                }
                visitIntExpr(expressions.get(i));
            }
            output.append(']');
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write int array literal: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitFloatArr(OfpPashaievaShevchenkoParser.FloatArrContext ctx) {
        try {
            output.append('[');
            var expressions = ctx.floatExpr();
            for (int i = 0; i < expressions.size(); i += 1) {
                if (i > 0) {
                    output.append(", ");
                }
                visitFloatExpr(expressions.get(i));
            }
            output.append(']');
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write float array literal: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitCharArr(OfpPashaievaShevchenkoParser.CharArrContext ctx) {
        try {
            output.append('[');
            var expressions = ctx.charExpr();
            for (int i = 0; i < expressions.size(); i += 1) {
                if (i > 0) {
                    output.append(", ");
                }
                visitCharExpr(expressions.get(i));
            }
            output.append(']');
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write float array literal: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitNewIntArr(OfpPashaievaShevchenkoParser.NewIntArrContext ctx) {
        try {
            output.append("[0] * ");
            visitIntExpr(ctx.intExpr());
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write new int array expression: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitNewFloatArr(OfpPashaievaShevchenkoParser.NewFloatArrContext ctx) {
        try {
            output.append("[0.0] * ");
            visitIntExpr(ctx.intExpr());
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write new float array expression: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitNewCharArr(OfpPashaievaShevchenkoParser.NewCharArrContext ctx) {
        try {
            output.append("[' '] * ");
            visitIntExpr(ctx.intExpr());
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write new char array expression: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitLengthRead(OfpPashaievaShevchenkoParser.LengthReadContext ctx) {
        try {
            output.append("len(");
            visit(ctx.getChild(0));
            output.append(')');
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write new char array expression: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitArrGet(OfpPashaievaShevchenkoParser.ArrGetContext ctx) {
        try {
            visit(ctx.getChild(0));
            output.append('[');
            visitIntExpr(ctx.intExpr());
            output.append(']');
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write array access statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitVariable(OfpPashaievaShevchenkoParser.VariableContext ctx) {
        var variableName = ctx.ID().getText();
        try {
            output.append(idController.resolveVariable(ctx.ID().getText()));
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException(String.format("failed to write variable '%s': %s", variableName, exception.getMessage()),
                    exception));
        }
        return null;
    }

    private void appendFunction(ParserRuleContext ctx) throws IOException {
        startFunction(ctx);
        visitChildren(ctx);
        finishFunction(ctx);
    }

    private void startFunction(ParserRuleContext ctx) throws IOException {
        var functionName = ctx.getChild(1).getText();
        functionSymbol = globalScope.resolve(functionName);
        idController.enterScope();
        output.append("def ").append(idController.resolveFunction(functionName));
    }

    private void finishFunction(ParserRuleContext ctx) throws IOException {
        output.append("\n\n");
        functionSymbol = null;
        idController.exitScope();
    }

    private void appendIfDef(ParserRuleContext ctx) throws IOException {
        output.append(getIndent()).append("if ");
        visit(ctx.getChild(2));
        output.append(":\n");

        appendStatOrBlockOrPass((ParserRuleContext)ctx.getChild(4));

        if (ctx.getChildCount() > 5) {
            output.append(getIndent()).append("else:\n");
            appendStatOrBlockOrPass((ParserRuleContext)ctx.getChild(6));
        }
    }

    private void appendWhileDef(ParserRuleContext ctx) throws IOException {
        output.append(getIndent()).append("while ");
        visit(ctx.getChild(2));
        output.append(":\n");

        appendStatOrBlockOrPass((ParserRuleContext)ctx.getChild(4));
    }

    private void appendBlock(ParserRuleContext ctx) throws IOException {
        enterBlock(ctx);
        if (ctx.getChildCount() == 2
                || ctx.getChildCount() == 3 && DECL_STATEMENTS_CLASSES.contains(ctx.getChild(1).getClass())) {
            appendPass();
        }
        visitChildren(ctx);
        exitBlock(ctx);
    }

    private void enterBlock(ParserRuleContext ctx) throws IOException {
        depth += 1;

        if (currentScope == null) {
            currentScope = functionSymbol.getVariableScope();
        } else {
            idController.enterScope();
            currentScope = currentScope.getEnclosedScope(ctx);
        }
    }

    private void exitBlock(ParserRuleContext ctx) throws IOException {
        currentScope = currentScope.getEnclosingScope();
        if (currentScope != null) {
            var scopedVariables = idController.getScopeDefinedVariables();
            if (scopedVariables.length > 0) {
                output.append(getIndent()).append("del ")
                        .append(String.join(", ", idController.getScopeDefinedVariables())).append("\n");
            }
            idController.exitScope();
        }
        depth -= 1;
    }

    private void appendScStat(ParserRuleContext ctx) throws IOException {
        var statement = ctx.getChild(0);
        var possibleDeclaration = statement.getChild(0);
        if (DECL_STATEMENTS_CLASSES.contains(possibleDeclaration.getClass())) {
            var variableName = possibleDeclaration.getChild(0).getChild(1).getText();
            idController.defineVariable(variableName);
            if (possibleDeclaration.getChildCount() == 1) {
                return;
            }
            output.append(getIndent());
            appendAssign(variableName, possibleDeclaration.getChild(2));
            output.append("\n");
            return;
        }
        output.append(getIndent());
        visit(statement);
        output.append("\n");
    }

    private void appendAssign(String variableName, ParseTree expression) throws IOException {
        output.append(idController.resolveVariable(variableName)).append(" = ");
        visit(expression);
    }

    private void appendStatOrBlockOrPass(ParserRuleContext statOrBlock) throws IOException {
        var statOrBlockNode = statOrBlock.getChild(0);
        if (!BLOCK_CLASSES.contains(statOrBlockNode.getClass())) {
            depth += 1;
            if (DECL_STATEMENTS_CLASSES.contains(statOrBlockNode.getClass())) {
                appendPass();
            } else {
                visit(statOrBlockNode);
            }
            depth -= 1;
            return;
        }
        visit(statOrBlockNode);
    }

    private void appendPass() throws IOException {
        output.append(getIndent()).append("pass\n");
    }

    private String getIndent() {
        return indentCache.computeIfAbsent(depth, "    "::repeat);
    }
}
