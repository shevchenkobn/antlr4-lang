package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.listeners;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoParser;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolNotDeclaredException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolNotInitializedException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.VariableSymbol;

public class InitializeSymbolsAndCheckReferencesListener extends BaseOfpListener {

    private Scope<VariableSymbol> currentScope;
    private FunctionSymbol currentFunction;
    private boolean isFirstBlock = false;

    public InitializeSymbolsAndCheckReferencesListener(Scope<FunctionSymbol> globalScope) {
        super(globalScope);
    }

    @Override
    public void enterMainDef(OfpPashaievaShevchenkoParser.MainDefContext ctx) {
        currentFunction = globalScope.resolve("main");
        currentScope = currentFunction.getVariableScope();
        isFirstBlock = true;
    }

    @Override
    public void enterAnyFuncDef(OfpPashaievaShevchenkoParser.AnyFuncDefContext ctx) {
        currentFunction = globalScope.resolve(ctx.getChild(0).getChild(1).getText());
        currentScope = currentFunction.getVariableScope();
        isFirstBlock = true;
    }

    @Override
    public void enterBlock(OfpPashaievaShevchenkoParser.BlockContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitBlock(OfpPashaievaShevchenkoParser.BlockContext ctx) {
        exitScope();
    }

    @Override
    public void enterVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitVoidBlock(OfpPashaievaShevchenkoParser.VoidBlockContext ctx) {
        exitScope();
    }

    @Override
    public void enterFuncBlock(OfpPashaievaShevchenkoParser.FuncBlockContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void enterVariable(OfpPashaievaShevchenkoParser.VariableContext ctx) {
        checkVariableDefinition(ctx.ID());
    }

    @Override
    public void enterFuncCall(OfpPashaievaShevchenkoParser.FuncCallContext ctx) {
        String functionName = ctx.ID().getText();

        try {
            globalScope.resolve(functionName);
        } catch (SymbolNotDeclaredException exception){
            var token = ctx.getStart();
            exception.setSourceCodeLine(token.getLine());
            exception.setSourceCodeCharacterInLineIndex(token.getCharPositionInLine());
            errors.add(exception);
        }
    }

    @Override
    public void enterVarDef(OfpPashaievaShevchenkoParser.VarDefContext ctx) {
        addVariableInit(ctx.getChild(0).getChild(1).getText());
    }

    @Override
    public void enterAssign(OfpPashaievaShevchenkoParser.AssignContext ctx) {
        addVariableInit(ctx);
    }

    @Override
    public void enterIntDecl(OfpPashaievaShevchenkoParser.IntDeclContext ctx) {
        addVariableInit(ctx);
    }

    @Override
    public void enterFloatDecl(OfpPashaievaShevchenkoParser.FloatDeclContext ctx) {
        addVariableInit(ctx);
    }

    @Override
    public void enterCharDecl(OfpPashaievaShevchenkoParser.CharDeclContext ctx) {
        addVariableInit(ctx);
    }

    @Override
    public void enterBoolDecl(OfpPashaievaShevchenkoParser.BoolDeclContext ctx) {
        addVariableInit(ctx);
    }

    @Override
    public void enterStrDecl(OfpPashaievaShevchenkoParser.StrDeclContext ctx) {
        addVariableInit(ctx);
    }

    @Override
    public void enterIntArrDecl(OfpPashaievaShevchenkoParser.IntArrDeclContext ctx) {
        addVariableInit(ctx);
    }

    @Override
    public void enterFloatArrDecl(OfpPashaievaShevchenkoParser.FloatArrDeclContext ctx) {
        addVariableInit(ctx);
    }

    @Override
    public void enterCharArrDecl(OfpPashaievaShevchenkoParser.CharArrDeclContext ctx) {
        addVariableInit(ctx);
    }

    private void enterScope(ParserRuleContext ruleContext){
        if (isFirstBlock)
        {
            isFirstBlock = false;
            return;
        }

        if (currentFunction == null)
            throw new RuntimeException();

        currentScope = currentScope.getEnclosedScope(ruleContext);

        if (currentScope == null)
            throw new RuntimeException();
    }

    private void exitScope() {
        currentScope = currentScope.getEnclosingScope();
    }

    private void checkVariableDefinition(TerminalNode variable){
        if (variable == null)
            return;

        String variableName = variable.getText();
        try {
            currentScope.resolve(variableName);
            checkVariableInit(variableName);
        } catch (SymbolNotDeclaredException | SymbolNotInitializedException exception) {
            var token = variable.getSymbol();
            exception.setSourceCodeLine(token.getLine());
            exception.setSourceCodeCharacterInLineIndex(token.getCharPositionInLine());
            errors.add(exception);
        }
    }

    private void checkVariableInit(String variableName){
        var scope = currentScope;
        while (scope != null) {
            var v = scope.resolve(variableName);
            if (v != null && v.isInitialized()) {
                return;
            }
            scope = scope.getEnclosingScope();
        }
        throw new SymbolNotInitializedException(variableName);
    }

    private void addVariableInit(ParserRuleContext ctx){
        ParseTree assignedValue = ctx.getChild(2);
        if (assignedValue == null)
            return;

        String variableName;
        ParseTree leftExpression = ctx.getChild(0);

        if (leftExpression instanceof TerminalNode)
            variableName = leftExpression.getText();
        else
            variableName = leftExpression.getChild(1).getText();

        addVariableInit(variableName);
    }

    private void addVariableInit(String variableName) {
        currentScope.resolve(variableName).initialize();
    }
}
