package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

public class IdentifierException extends IllegalStateException {
    protected final String identifierName;

    public String getIdentifierName() {
        return identifierName;
    }

    public IdentifierException(String identifierName) {
        this.identifierName = identifierName;
    }

    public IdentifierException(String identifierName, String s) {
        super(s);
        this.identifierName = identifierName;
    }

    public IdentifierException(String identifierName, String message, Throwable cause) {
        super(message, cause);
        this.identifierName = identifierName;
    }

    public IdentifierException(String identifierName, Throwable cause) {
        super(cause);
        this.identifierName = identifierName;
    }
}
