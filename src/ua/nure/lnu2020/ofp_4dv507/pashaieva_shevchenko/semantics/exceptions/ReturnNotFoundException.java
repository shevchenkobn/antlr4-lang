package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

public class ReturnNotFoundException extends SymbolException {
    private static final String MESSAGE = "return statement is not found in function";

    public ReturnNotFoundException(String functionName) {
        super(functionName, MESSAGE);
    }

    public ReturnNotFoundException(String functionName, Throwable cause) {
        super(functionName, MESSAGE, cause);
    }
}
