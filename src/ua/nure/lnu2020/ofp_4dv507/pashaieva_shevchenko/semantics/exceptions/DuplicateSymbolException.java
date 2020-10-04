package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

public class DuplicateSymbolException extends SymbolException {
    private static final String MESSAGE = "already declared";

    public DuplicateSymbolException(String symbolName) {
        super(symbolName, MESSAGE);
    }

    public DuplicateSymbolException(String symbolName, Throwable cause) {
        super(symbolName, MESSAGE, cause);
    }
}
