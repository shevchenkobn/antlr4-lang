package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;

public class SymbolTypeException extends SymbolException {
    protected final OfpType symbolType;

    public OfpType getSymbolType() {
        return symbolType;
    }

    public SymbolTypeException(OfpType symbolType, String symbolName, String message) {
        super(symbolName, getMessagePrefix(symbolType) + message);
        this.symbolType = symbolType;
    }

    public SymbolTypeException(OfpType symbolType, String symbolName, String message, Throwable cause) {
        super(symbolName, getMessagePrefix(symbolType) + message, cause);
        this.symbolType = symbolType;
    }

    private static String getMessagePrefix(OfpType symbolType) {
        return "type " + symbolType.getName();
    }
}
