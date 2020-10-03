package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;

public class IdentifierTypeException extends IdentifierException {
    protected final OfpType identifierType;

    public OfpType getIdentifierType() {
        return identifierType;
    }

    public IdentifierTypeException(OfpType identifierType, String identifierName) {
        super(identifierName);
        this.identifierType = identifierType;
    }

    public IdentifierTypeException(OfpType identifierType, String identifierName, String s) {
        super(identifierName, s);
        this.identifierType = identifierType;
    }

    public IdentifierTypeException(OfpType identifierType, String identifierName, String message, Throwable cause) {
        super(identifierName, message, cause);
        this.identifierType = identifierType;
    }

    public IdentifierTypeException(OfpType identifierType, String identifierName, Throwable cause) {
        super(identifierName, cause);
        this.identifierType = identifierType;
    }
}
