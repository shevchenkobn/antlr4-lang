package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.listeners;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoParser;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.FunctionMap;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.DuplicateSymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.ReturnNotFoundException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.VariableSymbol;

import java.util.LinkedHashMap;

public class SymbolTableConstructionListener extends BaseOfpListener {
    private final FunctionMap functions = new FunctionMap();

    private Scope<VariableSymbol> scope;
    private LinkedHashMap<Token, FunctionSymbol.ParameterSymbol> functionArgumentsMap;
    private OfpType functionType;
    private TerminalNode functionName;
    private ParseTree functionNode;
    private boolean hasReturnMet;

    public SymbolTableConstructionListener(Scope<FunctionSymbol> globalScope){
        super(globalScope);
    }

    public FunctionMap getFunctions() {
        return functions;
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
        processBlockStart(ctx);
    }

    @Override
    public void enterFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx) {
        processFunctionHeader();
        startTrackingReturn();
    }

    @Override
    public void enterVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx) {
        processBlockStart(ctx);
    }

    @Override
    public void exitBlock(OfpPashaievaShevchenkoParser.BlockContext ctx) {
        processBlockFinish();
    }

    @Override
    public void exitFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx) {
        finishTrackingReturn(((TerminalNode)ctx.parent.getChild(1)).getSymbol());
        processBlockFinish();
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
        functionName = name;
        functionNode = node;
    }

    private void startFunctionArgs(int length) {
        functionArgumentsMap = new LinkedHashMap<>(length);
    }

    private boolean isInFunctionBody() {
        return this.functionArgumentsMap == null;
    }

    private void processVariableDefinition(TerminalNode type, TerminalNode name) {
        if (isInFunctionBody()) {
            var variable = new VariableSymbol(OfpType.getByName(type.getText()), name.getText());
            try {
                scope.define(variable);
            } catch (DuplicateSymbolException exception) {
                var token = name.getSymbol();
                exception.setSourceCodeLine(token.getLine());
                exception.setSourceCodeCharacterInLineIndex(token.getCharPositionInLine());
                this.errors.add(exception);
            }
        } else {
            var token = name.getSymbol();
            functionArgumentsMap.put(token, new FunctionSymbol.ParameterSymbol(
                            OfpType.getByName(type.getText()),
                            name.getText()));
        }
    }

    private void processBlockStart(ParseTree parseTree) {
        if (isInFunctionBody()) {
            processInnerBlockStart(parseTree);
        } else {
            processFunctionHeader();
        }
    }

    private void processInnerBlockStart(ParseTree parseTree) {
        scope = new Scope<>(scope, parseTree, VariableSymbol::new);
    }

    private void processBlockFinish() {
        scope = scope.getEnclosingScope();
    }

    private void processFunctionHeader() {
        var function = new FunctionSymbol(this.functionType, this.functionName.getText(), functionArgumentsMap);
        if (function.getParameterExceptions() != null) {
            var token = functionName.getSymbol();
            for (var error : function.getParameterExceptions()) {
                error.setSourceCodeLine(token.getLine());
                errors.add(error);
            }
        }
        try {
            globalScope.define(function);
        } catch (DuplicateSymbolException exception) {
            var token = functionName.getSymbol();
            exception.setSourceCodeLine(token.getLine());
            exception.setSourceCodeCharacterInLineIndex(token.getCharPositionInLine());
            errors.add(exception);
        }
        functions.put(this.functionNode, function);
        scope = function.getVariableScope();

        this.functionType = null;
        this.functionName = null;
        this.functionNode = null;
        this.functionArgumentsMap = null;
    }

    private void startTrackingReturn() {
        hasReturnMet = false;
    }

    private void markReturnMet() {
        hasReturnMet = true;
    }

    private void finishTrackingReturn(Token functionNameToken) {
        if (!hasReturnMet) {
            var exception = new ReturnNotFoundException(functionNameToken.getText());
            exception.setSourceCodeLine(functionNameToken.getLine());
            exception.setSourceCodeCharacterInLineIndex(functionNameToken.getCharPositionInLine());
            errors.add(exception);
        } else {
            hasReturnMet = false;
        }
    }
}
