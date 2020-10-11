package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.visitors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoParser;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolTypeException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.VariableSymbol;

import java.util.ArrayList;
import java.util.Stack;

public class TypeCheckingVisitor extends BaseOfpTypeVisitor {

    private static final ArrayList<OfpType> ComparableTypes = new ArrayList<>();
    private static final ArrayList<OfpType> LengthDefinedTypes = new ArrayList<>();
    private static final ArrayList<OfpType> PrintableTypes = new ArrayList<>();

    private FunctionSymbol currentFunction;
    private Scope<VariableSymbol> currentScope;
    private final Stack<OfpPashaievaShevchenkoParser.IntExprContext> intExprStack = new Stack<>();

    static {
        ComparableTypes.add(OfpType.INT);
        ComparableTypes.add(OfpType.FLOAT);
        ComparableTypes.add(OfpType.CHAR);
        ComparableTypes.add(OfpType.BOOL);

        LengthDefinedTypes.add(OfpType.INT_ARR);
        LengthDefinedTypes.add(OfpType.FLOAT_ARR);
        LengthDefinedTypes.add(OfpType.CHAR_ARR);
        LengthDefinedTypes.add(OfpType.STRING);

        PrintableTypes.add(OfpType.INT);
        PrintableTypes.add(OfpType.FLOAT);
        PrintableTypes.add(OfpType.BOOL);
        PrintableTypes.add(OfpType.CHAR);
        PrintableTypes.add(OfpType.STRING);
    }

    public TypeCheckingVisitor(Scope<FunctionSymbol> globalScope)
    {
        super(globalScope);
    }

    @Override
    public OfpType visitIntLiteral(OfpPashaievaShevchenkoParser.IntLiteralContext ctx) {
        return OfpType.INT;
    }

    @Override
    public OfpType visitFloatLiteral(OfpPashaievaShevchenkoParser.FloatLiteralContext ctx) {
        return OfpType.FLOAT;
    }

    @Override
    public OfpType visitIntExpr(OfpPashaievaShevchenkoParser.IntExprContext ctx) {
//        return checkExpression(super.visitIntExpr(ctx), OfpType.INT, ctx);
        intExprStack.push(ctx);
        var type = super.visitIntExpr(ctx);
        intExprStack.pop();
        return type;
    }

    @Override
    public OfpType visitFloatExpr(OfpPashaievaShevchenkoParser.FloatExprContext ctx) {
        return checkExpression(OfpType.FLOAT,super.visitFloatExpr(ctx),  ctx);
    }

    @Override
    public OfpType visitStrExpr(OfpPashaievaShevchenkoParser.StrExprContext ctx) {
        if (ctx.STRING() != null)
            return OfpType.STRING;

        return checkExpression(OfpType.STRING, super.visitStrExpr(ctx), ctx);
    }

    @Override
    public OfpType visitCharExpr(OfpPashaievaShevchenkoParser.CharExprContext ctx) {
        if (ctx.QUOTED_CHAR() != null)
            return OfpType.CHAR;

        return checkExpression(OfpType.CHAR, super.visitCharExpr(ctx), ctx);
    }

    @Override
    public OfpType visitBoolExpr(OfpPashaievaShevchenkoParser.BoolExprContext ctx) {
        if (ctx.TRUE() != null || ctx.FALSE() != null)
            return OfpType.BOOL;

        if (ctx.children.size() > 2 && ctx.getChild(1) instanceof TerminalNode){
            ParseTree leftExpression = ctx.getChild(0);
            ParseTree rightExpression = ctx.getChild(2);

            OfpType leftExpressionType = visit(leftExpression);
            OfpType rightExpressionType = visit(rightExpression);

            if (!ComparableTypes.contains(leftExpressionType))
                errors.add(new SymbolTypeException(leftExpressionType,
                        ComparableTypes.toArray(OfpType[]::new),
                        leftExpression.getText()));

            if ((ctx.GT() != null || ctx.LT() != null)
                    && (leftExpressionType != OfpType.INT && leftExpressionType != OfpType.FLOAT))
                errors.add(new SymbolTypeException(leftExpressionType,
                        new OfpType[] {OfpType.INT, OfpType.FLOAT},
                        leftExpression.getText()));

            checkExpression(leftExpressionType, rightExpressionType, rightExpression);

            return OfpType.BOOL;
        }

        return checkExpression(OfpType.BOOL, super.visitBoolExpr(ctx), ctx);
    }

    @Override
    public OfpType visitIntArr(OfpPashaievaShevchenkoParser.IntArrContext ctx) {
        super.visitIntArr(ctx);
        return OfpType.INT_ARR;
    }

    @Override
    public OfpType visitFloatArr(OfpPashaievaShevchenkoParser.FloatArrContext ctx) {
        super.visitFloatArr(ctx);
        return OfpType.FLOAT_ARR;
    }

    @Override
    public OfpType visitCharArr(OfpPashaievaShevchenkoParser.CharArrContext ctx) {
        super.visitCharArr(ctx);
        return OfpType.CHAR_ARR;
    }

    @Override
    public OfpType visitNewIntArr(OfpPashaievaShevchenkoParser.NewIntArrContext ctx) {
        super.visitNewIntArr(ctx);
        return OfpType.INT_ARR;
    }

    @Override
    public OfpType visitNewFloatArr(OfpPashaievaShevchenkoParser.NewFloatArrContext ctx) {
        super.visitNewFloatArr(ctx);
        return OfpType.FLOAT_ARR;
    }

    @Override
    public OfpType visitNewCharArr(OfpPashaievaShevchenkoParser.NewCharArrContext ctx) {
        super.visitNewCharArr(ctx);
        return OfpType.CHAR_ARR;
    }

    @Override
    public OfpType visitIntArrExpr(OfpPashaievaShevchenkoParser.IntArrExprContext ctx) {
        return checkExpression(OfpType.INT_ARR, super.visitIntArrExpr(ctx), ctx);
    }

    @Override
    public OfpType visitFloatArrExpr(OfpPashaievaShevchenkoParser.FloatArrExprContext ctx) {
        return checkExpression(OfpType.FLOAT_ARR, super.visitFloatArrExpr(ctx), ctx);
    }

    @Override
    public OfpType visitCharArrExpr(OfpPashaievaShevchenkoParser.CharArrExprContext ctx) {
        return checkExpression(OfpType.CHAR_ARR, super.visitCharArrExpr(ctx), ctx);
    }

    @Override
    public OfpType visitVariable(OfpPashaievaShevchenkoParser.VariableContext ctx) {
        return currentScope.resolve(ctx.ID().getText()).getType();
    }

    @Override
    public OfpType visitReturnExpr(OfpPashaievaShevchenkoParser.ReturnExprContext ctx) {
        ParseTree expression = ctx.getChild(1);
        OfpType expressionType = visit(expression);

        checkExpression(currentFunction.getType(), expressionType, expression);

        return null;
    }

    @Override
    public OfpType visitAssign(OfpPashaievaShevchenkoParser.AssignContext ctx) {
        OfpType variableType = currentScope.resolve(ctx.ID().getText()).getType();
        OfpType expressionType = visit(ctx.getChild(2));

        checkExpression(variableType, expressionType, ctx.getChild(2));

        return null;
    }

    @Override
    public OfpType visitArrGet(OfpPashaievaShevchenkoParser.ArrGetContext ctx) {
        OfpType symbolType = visit(ctx.getChild(0));
        visit(ctx.getChild(2));

        switch (symbolType) {
            case INT_ARR:
                return OfpType.INT;
            case FLOAT_ARR:
                return OfpType.FLOAT;
            case CHAR_ARR:
                return OfpType.CHAR;
        }

        errors.add(new SymbolTypeException(symbolType,
                        new OfpType[]{OfpType.INT_ARR, OfpType.FLOAT_ARR, OfpType.CHAR_ARR},
                        ctx.getChild(0).getText()));

        return OfpType.INT;
    }

    @Override
    public OfpType visitArrSet(OfpPashaievaShevchenkoParser.ArrSetContext ctx) {
        OfpType leftType = visit(ctx.getChild(0));
        ParseTree rightExpression = ctx.getChild(2);
        OfpType rightType = visit(rightExpression);

        checkExpression(leftType, rightType, rightExpression);

        return null;
    }

    @Override
    public OfpType visitPrintable(OfpPashaievaShevchenkoParser.PrintableContext ctx) {
        OfpType expressionType = visit(ctx.getChild(0));
        if (!PrintableTypes.contains(expressionType))
            errors.add(new SymbolTypeException(expressionType, PrintableTypes.toArray(OfpType[]::new), ctx.getText()));

        return null;
    }

    @Override
    public OfpType visitMainDef(OfpPashaievaShevchenkoParser.MainDefContext ctx) {
        currentFunction = globalScope.resolve("main");
        super.visitMainDef(ctx);
        currentScope = null;

        return null;
    }

    @Override
    public OfpType visitVoidFuncDef(OfpPashaievaShevchenkoParser.VoidFuncDefContext ctx) {
        currentFunction = globalScope.resolve(ctx.ID().getText());
        super.visitVoidFuncDef(ctx);
        currentScope = null;

        return null;
    }

    @Override
    public OfpType visitFuncDef(OfpPashaievaShevchenkoParser.FuncDefContext ctx) {
        currentFunction = globalScope.resolve(ctx.ID().getText());
        super.visitFuncDef(ctx);
        currentScope = null;

        return null;
    }

    @Override
    public OfpType visitFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx) {
        enterScope(ctx);
        super.visitFuncBlock(ctx);
        currentScope = currentScope.getEnclosingScope();

        return null;
    }

    @Override
    public OfpType visitVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx) {
        enterScope(ctx);
        super.visitVoidBlock(ctx);
        currentScope = currentScope.getEnclosingScope();

        return null;
    }

    @Override
    public OfpType visitBlock(OfpPashaievaShevchenkoParser.BlockContext ctx) {
        enterScope(ctx);
        super.visitBlock(ctx);

        currentScope = currentScope.getEnclosingScope();
        return null;
    }

    @Override
    public OfpType visitLengthRead(OfpPashaievaShevchenkoParser.LengthReadContext ctx) {
        if (ctx.STRING() != null)
            return OfpType.INT;

        ParseTree leftExpression = ctx.getChild(0);
        OfpType childType = visit(leftExpression);
        if (!LengthDefinedTypes.contains(childType))
            errors.add(new SymbolTypeException(childType, LengthDefinedTypes.toArray(OfpType[]::new), leftExpression.getText()));

        return OfpType.INT;
    }

    @Override
    public OfpType visitFuncCall(OfpPashaievaShevchenkoParser.FuncCallContext ctx) {
        FunctionSymbol function = globalScope.resolve(ctx.ID().getText());
        var arguments = function.getArguments();

        var parametersCount = 0;
        for (ParseTree parameter : ctx.children) {
            if (!(parameter instanceof OfpPashaievaShevchenkoParser.ExprContext))
                continue;

            parametersCount++;
            if (arguments.length < parametersCount) {
                errors.add(new SymbolException(ctx.getText(), "redundant parameters are specified in function call."));
                break;
            }

            OfpType parameterType = visit(parameter);
            OfpType argumentType = arguments[parametersCount - 1].getType();

            if (argumentType != parameterType)
                errors.add(new SymbolTypeException(parameterType, argumentType, ctx.getText()));
        }

        if (arguments.length > parametersCount)
            errors.add(new SymbolException(ctx.getText(), "parameters are missing."));

        return function.getType();
    }

    @Override
    protected OfpType aggregateResult(OfpType aggregate, OfpType nextResult) {
        if (intExprStack.empty()) {
            return super.aggregateResult(aggregate, nextResult);
        }
        return checkExpression(aggregate, nextResult, intExprStack.peek());
    }

    private void enterScope(ParserRuleContext ctx) {
        if (currentScope == null) {
            currentScope = currentFunction.getVariableScope();
            return;
        }

        currentScope = currentScope.getEnclosedScope(ctx);
    }

    private OfpType checkExpression(OfpType expectedType, OfpType realType, ParseTree ctx) {
        if (expectedType != null && realType != null && realType != expectedType) {
            var error = new SymbolTypeException(realType, expectedType, ctx.getText());
            errors.add(error);
        }

        return expectedType != null ? expectedType : realType;
    }
}
