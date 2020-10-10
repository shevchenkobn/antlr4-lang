package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;

public class SymbolTypeException extends SymbolException {
    private static final String MESSAGE = " is invalid. Expected types: ";

    public SymbolTypeException(OfpType symbolType, OfpType expectedType, String symbolName) {
        super(symbolName, getMessage(symbolType, expectedType));
    }

    public SymbolTypeException(OfpType symbolType, OfpType[] expectedTypes, String symbolName) {
        super(symbolName, getMessage(symbolType, expectedTypes));
    }

    public SymbolTypeException(OfpType symbolType, OfpType expectedType, String symbolName, Throwable cause) {
        super(symbolName, getMessage(symbolType, expectedType), cause);
    }

    public SymbolTypeException(OfpType symbolType, OfpType[] expectedTypes, String symbolName, Throwable cause) {
        super(symbolName, getMessage(symbolType, expectedTypes), cause);
    }

    private static String getMessage(OfpType symbolType, OfpType expectedType){
        return getMessage(symbolType, new OfpType[] {expectedType});
    }

    private static String getMessage(OfpType symbolType, OfpType[] expectedTypes){
        String[] typeNames = new String[expectedTypes.length];
        for (int i = 0; i < expectedTypes.length; i++)
            typeNames[i] = expectedTypes[i].getName();

        String symbolName = symbolType != null ? symbolType.getName() : "VOID";
        return String.format("type '%s' %s '%s'", symbolName, MESSAGE, String.join(", ",typeNames));
    }
}
