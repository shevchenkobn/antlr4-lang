package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;

public class VariableSymbol extends Symbol {
    private boolean initialized;

    public void initialize() {
        initialized = true;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public VariableSymbol(OfpType type, String name) {
        super(type, name);
    }
}
