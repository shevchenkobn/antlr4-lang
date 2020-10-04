package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoBaseListener;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoParser;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.DuplicateSymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.ReturnNotFoundException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.VariableSymbol;

import java.util.ArrayList;

public class SymbolTableConstructionListener extends OfpPashaievaShevchenkoBaseListener {
    private final FunctionMap functions = new FunctionMap();
    private final ArrayList<IllegalStateException> errors = new ArrayList<>();

    private Scope<FunctionSymbol> functionScope = new Scope<>(null);
    private FunctionSymbol function;
    private Scope<VariableSymbol> scope;
    private FunctionSymbol.ParameterSymbol[] functionArguments;
    private int functionParameterIndex = -1;
    private OfpType functionType;
    private String functionName;
    private ParseTree functionNode;
    private boolean hasReturnMet;

    public FunctionMap getFunctions() {
        return functions;
    }

    public ArrayList<IllegalStateException> getErrors() {
        return errors;
    }

    @Override
    public void enterMainDef(OfpPashaievaShevchenkoParser.MainDefContext ctx) {
        startFunction(null, ctx.MAIN(), ctx);
        startFunctionArgs(0);
    }

    @Override
    public void enterVoidFuncDef(OfpPashaievaShevchenkoParser.VoidFuncDefContext ctx) {
        startFunction(null, ctx.ID(), ctx);
    }

    @Override
    public void enterFuncDef(OfpPashaievaShevchenkoParser.FuncDefContext ctx) {
        startFunction(OfpType.getByName(ctx.datatype().getText()), ctx.ID(), ctx);
    }

    @Override
    public void enterFuncArgs(OfpPashaievaShevchenkoParser.FuncArgsContext ctx) {
        startFunctionArgs(((ctx.children.size() - 2) + 1) / 2); // excluding brackets & commas
    }

    @Override
    public void enterReturnExpr(OfpPashaievaShevchenkoParser.ReturnExprContext ctx) {
        markReturnMet();
    }

    @Override
    public void enterBlock(OfpPashaievaShevchenkoParser.BlockContext ctx) {
        processBlockStart();
    }

    @Override
    public void enterFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx) {
        finishFunctionDefinition();
        startTrackingReturn();
    }

    @Override
    public void enterVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx) {
        processBlockStart();
    }

    @Override
    public void exitBlock(OfpPashaievaShevchenkoParser.BlockContext ctx) {
        processBlockFinish();
    }

    @Override
    public void exitFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx) {
        processBlockFinish();
        finishTrackingReturn();
    }

    @Override
    public void exitVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx) {
        processBlockFinish();
    }

    @Override
    public void enterIntDef(OfpPashaievaShevchenkoParser.IntDefContext ctx) {
        processVariableDefinition(ctx.DT_INT(), ctx.ID());
    }

    @Override
    public void enterFloatDef(OfpPashaievaShevchenkoParser.FloatDefContext ctx) {
        processVariableDefinition(ctx.DT_FLOAT(), ctx.ID());
    }

    @Override
    public void enterCharDef(OfpPashaievaShevchenkoParser.CharDefContext ctx) {
        processVariableDefinition(ctx.DT_CHAR(), ctx.ID());
    }

    @Override
    public void enterBoolDef(OfpPashaievaShevchenkoParser.BoolDefContext ctx) {
        processVariableDefinition(ctx.DT_BOOL(), ctx.ID());
    }

    @Override
    public void enterStrDef(OfpPashaievaShevchenkoParser.StrDefContext ctx) {
        processVariableDefinition(ctx.DT_STR(), ctx.ID());
    }

    @Override
    public void enterIntArrDef(OfpPashaievaShevchenkoParser.IntArrDefContext ctx) {
        processVariableDefinition(ctx.DT_INT_ARR(), ctx.ID());
    }

    @Override
    public void enterFloatArrDef(OfpPashaievaShevchenkoParser.FloatArrDefContext ctx) {
        processVariableDefinition(ctx.DT_FLOAT_ARR(), ctx.ID());
    }

    @Override
    public void enterCharArrDef(OfpPashaievaShevchenkoParser.CharArrDefContext ctx) {
        processVariableDefinition(ctx.DT_CHAR_ARR(), ctx.ID());
    }

    private void startFunction(OfpType type, TerminalNode name, ParseTree node) {
        functionType = type;
        functionName = name.getText();
        functionNode = node;
    }

    private void startFunctionArgs(int length) {
        functionArguments = new FunctionSymbol.ParameterSymbol[length];
        functionParameterIndex = 0;
    }

    private boolean isInFunctionBody() {
        return this.functionArguments == null;
    }

    private void processVariableDefinition(TerminalNode type, TerminalNode name) {
        if (isInFunctionBody()) {
            var variable = new VariableSymbol(OfpType.getByName(type.getText()), name.getText());
            try {
                scope.define(variable);
            } catch (DuplicateSymbolException exception) {
                this.errors.add(exception);
            }
        } else {
            functionArguments[functionParameterIndex] = new FunctionSymbol.ParameterSymbol(
                    OfpType.getByName(type.getText()),
                    name.getText());
            functionParameterIndex += 1;
        }
    }

    private void processBlockStart() {
        if (isInFunctionBody()) {
            processInnerBlockStart();
        } else {
            finishFunctionDefinition();
        }
    }

    private void processInnerBlockStart() {
        scope = new Scope<>(scope);
    }

    private void processBlockFinish() {
        scope = scope.getEnclosingScope();
    }

    private void finishFunctionDefinition() {
        function = new FunctionSymbol(this.functionType, this.functionName, functionArguments);
        try {
            functionScope.define(function);
            functions.put(this.functionNode, function);
            scope = function.getVariableScope();
        } catch (DuplicateSymbolException exception) {
            errors.add(exception);
        }

        this.functionType = null;
        this.functionName = null;
        this.functionNode = null;
        this.functionArguments = null;
        this.functionParameterIndex = -1;
    }

    private void startTrackingReturn() {
        hasReturnMet = false;
    }

    private void markReturnMet() {
        hasReturnMet = true;
    }

    private void finishTrackingReturn() {
        if (!hasReturnMet) {
            errors.add(new ReturnNotFoundException());
        } else {
            hasReturnMet = false;
        }
    }
}
