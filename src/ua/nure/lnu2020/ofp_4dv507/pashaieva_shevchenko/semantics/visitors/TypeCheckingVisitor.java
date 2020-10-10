package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.visitors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoParser;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolTypeException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.VariableSymbol;

import java.util.ArrayList;

public class TypeCheckingVisitor extends BaseOfpTypeVisitor {

    private static final ArrayList<OfpType> LengthDefinedTypes = new ArrayList<>();

    private FunctionSymbol currentFunction;
    private Scope<VariableSymbol> currentScope;

    static {
        LengthDefinedTypes.add(OfpType.INT_ARR);
        LengthDefinedTypes.add(OfpType.FLOAT_ARR);
        LengthDefinedTypes.add(OfpType.CHAR_ARR);
        LengthDefinedTypes.add(OfpType.STRING);
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
        return checkExpression(super.visitIntExpr(ctx), OfpType.INT, ctx);
    }

    @Override
    public OfpType visitFloatExpr(OfpPashaievaShevchenkoParser.FloatExprContext ctx) {
        return checkExpression(super.visitFloatExpr(ctx), OfpType.FLOAT, ctx);
    }

    @Override
    public OfpType visitStrExpr(OfpPashaievaShevchenkoParser.StrExprContext ctx) {
        if (ctx.STRING() != null)
            return OfpType.STRING;

        return checkExpression(super.visitStrExpr(ctx), OfpType.STRING, ctx);
    }

    @Override
    public OfpType visitCharExpr(OfpPashaievaShevchenkoParser.CharExprContext ctx) {
        if (ctx.QUOTED_CHAR() != null)
            return OfpType.CHAR;

        return checkExpression(super.visitCharExpr(ctx), OfpType.CHAR, ctx);
    }

    @Override
    public OfpType visitBoolExpr(OfpPashaievaShevchenkoParser.BoolExprContext ctx) {
        if (ctx.TRUE() != null || ctx.FALSE() != null)
            return OfpType.BOOL;

        OfpType result = super.visitBoolExpr(ctx);
        if (ctx.children.size() > 1)
            return OfpType.BOOL;

        return checkExpression(result, OfpType.BOOL, ctx);
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
        return checkExpression(super.visitIntArrExpr(ctx), OfpType.INT_ARR, ctx);
    }

    @Override
    public OfpType visitFloatArrExpr(OfpPashaievaShevchenkoParser.FloatArrExprContext ctx) {
        return checkExpression(super.visitFloatArrExpr(ctx), OfpType.FLOAT_ARR, ctx);
    }

    @Override
    public OfpType visitCharArrExpr(OfpPashaievaShevchenkoParser.CharArrExprContext ctx) {
        return checkExpression(super.visitCharArrExpr(ctx), OfpType.CHAR_ARR, ctx);
    }

    @Override
    public OfpType visitVariable(OfpPashaievaShevchenkoParser.VariableContext ctx) {
        return currentScope.resolve(ctx.ID().getText()).getType();
    }

    @Override
    public OfpType visitReturnExpr(OfpPashaievaShevchenkoParser.ReturnExprContext ctx) {
        ParseTree expression = ctx.getChild(1);
        OfpType expressionType = visit(expression);

        if (expressionType != currentFunction.getType())
            errors.add(new SymbolTypeException(expressionType, currentFunction.getType(), expression.getText()));

        return null;
    }

    @Override
    public OfpType visitAssign(OfpPashaievaShevchenkoParser.AssignContext ctx) {
        OfpType variableType = currentScope.resolve(ctx.ID().getText()).getType();
        OfpType expressionType = visit(ctx.getChild(2));

        if (variableType != expressionType)
            errors.add(new SymbolTypeException(expressionType, variableType, ctx.getChild(2).getText()));

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

        if (leftType != rightType)
            errors.add(new SymbolTypeException(rightType, leftType, rightExpression.getText()));

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

        if (arguments.length != parametersCount)
            errors.add(new SymbolException(ctx.getText(), "parameters are missing."));

        return function.getType();
    }

    private void enterScope(ParserRuleContext ctx) {
        if (currentScope == null) {
            currentScope = currentFunction.getVariableScope();
            return;
        }

        currentScope = currentScope.getEnclosedScope(ctx);
    }

    private OfpType checkExpression(OfpType realType, OfpType expectedType, ParserRuleContext ctx) {
        if (realType != expectedType)
            errors.add(new SymbolTypeException(realType, expectedType, ctx.getText()));

        return expectedType;
    }
}
