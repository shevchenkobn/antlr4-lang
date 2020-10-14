package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.python;

import org.antlr.v4.runtime.ParserRuleContext;
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
    private final Map<Integer,String> indentCache = new HashMap<Integer,String>();
    private OfpPashaievaShevchenkoParser.MainDefContext main;
    private FunctionSymbol functionSymbol;
    private Scope<VariableSymbol> currentScope;

    public PythonCodeGenerator(Scope<FunctionSymbol> globalScope, Appendable output) {
        super(globalScope);
        idController = new PythonIdController(globalScope.size());
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
        visitChildren(main.voidBlock());
        functionSymbol = null;
        currentScope = null;
        return null;
    }

    @Override
    public Void visitFuncDef(OfpPashaievaShevchenkoParser.FuncDefContext ctx) {
        try {
            startFunction(ctx);
            visitChildren(ctx);
            finishFunction(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException(String.format("failed to write function '%s': %s",
                    ctx.ID().getText(), exception.getMessage()), exception));
        }
        return null;
    }

    @Override
    public Void visitVoidFuncDef(OfpPashaievaShevchenkoParser.VoidFuncDefContext ctx) {
        try {
            startFunction(ctx);
            visitChildren(ctx);
            finishFunction(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException(String.format("failed to write function '%s': %s",
                    ctx.ID().getText(), exception.getMessage()), exception));
        }
        return null;
    }

    @Override
    public Void visitFuncArgs(OfpPashaievaShevchenkoParser.FuncArgsContext ctx) {
        try {
            output.append('(').append(Arrays.stream(functionSymbol.getArguments())
                    .map(Symbol::getName).collect(Collectors.joining(", "))).append("):\n");
            for (var argument : functionSymbol.getArguments()) {
                idController.defineVariable(argument.getName());
            }
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException(String.format("failed to write function args for '%s': %s",
                    functionSymbol.getName(), exception.getMessage()), exception));
        }
        return null;
    }

    @Override
    public Void visitFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx) {
        try {
            enterBlock(ctx);
            visitChildren(ctx);
            exitBlock(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write code block: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx) {
        try {
            enterBlock(ctx);
            visitChildren(ctx);
            exitBlock(ctx);
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write code block: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    @Override
    public Void visitBlock(OfpPashaievaShevchenkoParser.BlockContext ctx) {
        try {
            enterBlock(ctx);
            visitChildren(ctx);
            exitBlock(ctx);
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
            visit(ctx.expr());
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
            output.append(idController.resolveVariable(ctx.variable().get(0).ID().getText()))
                .append('[');
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
                visit(expressions.get(i));
            }
            visit(ctx.getChild(2));
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
            visit(ctx.printable());
            output.append(", end=’’)");
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
            visit(ctx.printable());
            output.append(')');
        } catch (IOException exception) {
            errors.add(new OfpSourceCodeException("failed to write println statement: " + exception.getMessage(),
                    exception));
        }
        return null;
    }

    private void startFunction(ParserRuleContext ctx) throws IOException {
        var functionName = ctx.getChild(1).getText();
        functionSymbol = globalScope.resolve(functionName);
        output.append("def ").append(idController.resolveFunction(functionName));
    }

    private void finishFunction(ParserRuleContext ctx) throws IOException {
        output.append("\n\n");
        functionSymbol = null;
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

    private void enterBlock(ParserRuleContext ctx) throws IOException {
        depth += 1;

        idController.enterScope();
        currentScope = currentScope == null ? functionSymbol.getVariableScope() : currentScope.getEnclosedScope(ctx);
    }

    private void exitBlock(ParserRuleContext ctx) throws IOException {
        currentScope = currentScope.getEnclosingScope();
        if (currentScope != null) {
            output.append(getIndent()).append("del ")
                    .append(String.join(", ", idController.getScopeDefinedVariables())).append("\n");
        }
        depth -= 1;
        idController.exitScope();
    }

    private void appendScStat(ParserRuleContext ctx) throws IOException {
        var statement = ctx.getChild(0);
        if (DECL_STATEMENTS_CLASSES.contains(statement.getClass())) {
            var variableName = statement.getChild(0).getChild(1).getText();
            idController.defineVariable(variableName);
            if (statement.getChildCount() == 1) {
                return;
            }
            output.append(getIndent());
            appendAssign(variableName, (ParserRuleContext)statement.getChild(1));
            output.append("\n");
        }
        output.append(getIndent());
        visit(statement);
        output.append("\n");
    }

    private void appendAssign(String variableName, ParserRuleContext expression) throws IOException {
        output.append(idController.resolveVariable(variableName)).append(" = ");
        visit(expression);
    }

    private void appendStatOrBlockOrPass(ParserRuleContext statOrBlock) throws IOException {
        if (!BLOCK_CLASSES.contains(statOrBlock.getClass())) {
            depth += 1;
            if (DECL_STATEMENTS_CLASSES.contains(statOrBlock.getClass())) {
                output.append(getIndent()).append("pass\n");
            } else {
                visit(statOrBlock);
            }
            depth -= 1;
            return;
        }
        visit(statOrBlock);
    }

    private String getIndent() {
        return indentCache.computeIfAbsent(depth, "    "::repeat);
    }
}
