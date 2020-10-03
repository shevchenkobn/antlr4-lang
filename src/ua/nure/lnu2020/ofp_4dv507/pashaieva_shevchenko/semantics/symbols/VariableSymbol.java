package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

public class VariableSymbol extends Symbol {
    public VariableSymbol(OfpType type, String name) {
        super(type, name);
        if (type == null) {
            throw new IllegalStateException("type is required for variable");
        }
    }
}
