package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolException;

public class VariableSymbol extends Symbol {
    public VariableSymbol(OfpType type, String name) {
        super(type, name);
        if (type == null) {
            throw new SymbolException(null, "type is required for variable");
        }
    }
}
