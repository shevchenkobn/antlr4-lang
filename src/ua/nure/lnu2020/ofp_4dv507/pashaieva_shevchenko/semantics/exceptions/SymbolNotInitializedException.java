package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

public class SymbolNotInitializedException extends SymbolException {

    private static final String MESSAGE = "is not initialized";

    public SymbolNotInitializedException(String symbolName) {
        super(symbolName, MESSAGE);
    }

    public SymbolNotInitializedException(String symbolName, Throwable cause){
        super(symbolName, MESSAGE, cause);
    }
}
