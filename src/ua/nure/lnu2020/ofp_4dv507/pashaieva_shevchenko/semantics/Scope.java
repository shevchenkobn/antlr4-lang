package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.DuplicateSymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolNotDeclaredException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.Symbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Scope<S extends Symbol> {
    /**
     * null if global (outermost) scope
     */
    private final Scope<S> enclosingScope;
    private final ArrayList<Scope<S>> enclosedScopes = new ArrayList<>();
    private final Map<String, S> symbols = new LinkedHashMap<>();

    public Scope<S> getEnclosingScope() {
        return enclosingScope;
    }

    public ArrayList<Scope<S>> getEnclosedScopes() {
        return enclosedScopes;
    }

    public Scope(Scope<S> enclosingScope) {
        this.enclosingScope = enclosingScope;
        if (this.enclosingScope != null) {
            this.enclosingScope.enclosedScopes.add(this);
        }
    }

    public void define(S sym) {
        if (symbols.containsKey(sym.getName())) {
            throw new DuplicateSymbolException(sym.getName());
        }
        symbols.put(sym.getName(), sym);
    }

    /**
     * If a name cannot be resolved in this scope,
     * try enclosing/parent scope recursively.
     * If null is returned, name/identifier not found in the symbol table!
     */
    public S resolve(String name) {
        if (symbols.containsKey(name)) {
            return symbols.get(name);
        }
        if (enclosingScope == null) {
            throw new SymbolNotDeclaredException(name);
        }
        return enclosingScope.resolve(name);
    }

    @Override
    public String toString() {
        var symbolsString = Arrays.toString(symbols.values().toArray());
        return enclosingScope == null
                ? String.format("Scope{symbols=%s}", symbolsString)
                : String.format("Scope{enclosingScope=%s, symbols=%s}", enclosingScope.toString(), symbolsString);
    }
}
