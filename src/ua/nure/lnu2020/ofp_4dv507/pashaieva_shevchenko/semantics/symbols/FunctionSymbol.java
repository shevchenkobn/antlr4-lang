package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols;

import org.antlr.v4.runtime.Token;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.DuplicateSymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolException;

import java.util.*;

public class FunctionSymbol extends Symbol {
    private ArrayList<DuplicateSymbolException> parameterExceptions;
    protected final ParameterSymbol[] arguments;
    protected final Scope<VariableSymbol> variableScope;
    private int varCount = 0;
    private int floatParameterCount = 0;
    private Map<Symbol,Integer> indices = new LinkedHashMap<>();

    public ParameterSymbol[] getArguments() {
        return arguments;
    }

    public Scope<VariableSymbol> getVariableScope() {
        return variableScope;
    }

    public ArrayList<DuplicateSymbolException> getParameterExceptions() {
        return parameterExceptions;
    }

    public void resetParameterExceptions() {
        this.parameterExceptions = null;
    }

    public FunctionSymbol(OfpType type, String name) {
        this(type, name, null, new LinkedHashMap<>(0));
    }

    public FunctionSymbol(OfpType type, String name, Scope<VariableSymbol> enclosingVariableScope) {
        this(type, name, enclosingVariableScope, new LinkedHashMap<>(0));
    }

    public FunctionSymbol(OfpType type, String name, LinkedHashMap<Token, ParameterSymbol> argumentsMap) {
        this(type, name, null, argumentsMap);
    }

    public FunctionSymbol(OfpType type, String name, Scope<VariableSymbol> enclosingVariableScope, LinkedHashMap<Token, ParameterSymbol> argumentsMap) {
        super(type, name);
        variableScope = new Scope<>(enclosingVariableScope, null, VariableSymbol::new);
        var list = new ArrayList<ParameterSymbol>(argumentsMap.size());
        for (var entry : argumentsMap.entrySet()) {
            var argument = entry.getValue();
            try {
                variableScope.define(argument);
                argument.setFunction(this);
                list.add(argument);
                addVariable(argument);
            } catch (DuplicateSymbolException exception) {
                if (parameterExceptions == null) {
                    parameterExceptions = new ArrayList<>();
                }
                var token = entry.getKey();
                exception.setSourceCodeLine(token.getLine());
                exception.setSourceCodeCharacterInLineIndex(token.getCharPositionInLine());
                parameterExceptions.add(exception);
            }
        }
        this.arguments = list.toArray(ParameterSymbol[]::new);
    }

    public void addVariable(Symbol symbol){
        if (arguments != null && indices.size() == arguments.length)
            varCount += floatParameterCount;

        indices.put(symbol, varCount);
        varCount++;

        if (symbol.getType() != OfpType.FLOAT)
            return;

        if (!(symbol instanceof ParameterSymbol)) {
            varCount++;
            return;
        }

        floatParameterCount++;
    }

    public int indexOf(Symbol sym) {
        return indices.get(sym);
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", arguments=" + Arrays.toString(arguments) +
                '}';
    }

    public static class ParameterSymbol extends VariableSymbol {
        private FunctionSymbol function;

        public FunctionSymbol getFunction() {
            return function;
        }

        private void setFunction(FunctionSymbol value) {
            if (function != null) {
                throw new SymbolException(name, "parameter already belongs to function.");
            }
            function = value;
        }

        public ParameterSymbol(OfpType type, String name) {
            super(type, name);
        }
    }
}
