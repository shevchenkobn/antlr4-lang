package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.DuplicateSymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolException;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionSymbol extends Symbol {
    private ArrayList<DuplicateSymbolException> parameterExceptions;
    protected final ParameterSymbol[] arguments;
    protected final Scope<VariableSymbol> variableScope;

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
        variableScope = new Scope<>(enclosingVariableScope, null);
        for (var argument : arguments) {
            try {
                variableScope.define(argument);
                argument.setFunction(this);
            } catch (DuplicateSymbolException exception) {
                if (parameterExceptions == null) {
                    parameterExceptions = new ArrayList<>();
                }
                parameterExceptions.add(exception);
            }
        }
        this.arguments = parameterExceptions == null ? arguments : Arrays.stream(arguments).filter(
                a -> a == Arrays.stream(arguments).filter(b -> a.getName().equals(b.getName())).findFirst().orElse(null)
        ).toArray(FunctionSymbol.ParameterSymbol[]::new);
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
        }

        public ParameterSymbol(OfpType type, String name) {
            super(type, name);
        }
    }
}
