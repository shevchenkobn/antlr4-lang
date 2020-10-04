package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

public class ReturnNotFoundException extends IllegalStateException {
    private static final String MESSAGE = "return statement is not found in function";

    public ReturnNotFoundException() {
        super(MESSAGE);
    }

    public ReturnNotFoundException(Throwable cause) {
        super(MESSAGE, cause);
    }
}
