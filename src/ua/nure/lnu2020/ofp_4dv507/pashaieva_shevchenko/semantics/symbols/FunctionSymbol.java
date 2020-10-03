package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

import java.util.Arrays;

public class FunctionSymbol extends Symbol {
    protected final ParameterSymbol[] arguments;
    protected final Scope<VariableSymbol> variableScope;

    public ParameterSymbol[] getArguments() {
        return arguments;
    }

    public Scope<VariableSymbol> getVariableScope() {
        return variableScope;
    }

    public FunctionSymbol(OfpType type, String name) {
        this(type, name, null, new ParameterSymbol[] {});
    }

    public FunctionSymbol(OfpType type, String name, Scope<VariableSymbol> enclosingVariableScope) {
        this(type, name, enclosingVariableScope, new ParameterSymbol[] {});
    }

    public FunctionSymbol(OfpType type, String name, ParameterSymbol[] arguments) {
        this(type, name, null, arguments);
    }

    public FunctionSymbol(OfpType type, String name, Scope<VariableSymbol> enclosingVariableScope, ParameterSymbol[] arguments) {
        super(type, name);
        variableScope = new Scope<>(enclosingVariableScope);
        this.arguments = arguments;
        for (var argument : this.arguments) {
            argument.setFunction(this);
            variableScope.define(argument);
        }
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
                throw new IllegalStateException(ParameterSymbol.class.getName() + " already belongs to function!");
            }
        }

        public ParameterSymbol(OfpType type, String name) {
            super(type, name);
        }
    }
}
