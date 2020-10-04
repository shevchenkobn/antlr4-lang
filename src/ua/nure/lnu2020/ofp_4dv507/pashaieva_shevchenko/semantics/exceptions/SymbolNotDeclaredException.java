package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

public class SymbolNotDeclaredException extends SymbolException {
    private static final String MESSAGE = "is not declared declared";
    public SymbolNotDeclaredException(String symbolName) {
        super(symbolName, MESSAGE);
    }

    public SymbolNotDeclaredException(String symbolName, Throwable cause) {
        super(symbolName, MESSAGE, cause);
    }
}
