package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

public class SymbolException extends IllegalStateException {
    protected final String symbolName;

    public String getSymbolName() {
        return symbolName;
    }

    public SymbolException(String symbolName, String message) {
        super(getMessagePrefix(symbolName) + message);
        this.symbolName = symbolName;
    }

    public SymbolException(String symbolName, String message, Throwable cause) {
        super(getMessagePrefix(symbolName) + message, cause);
        this.symbolName = symbolName;
    }

    protected static String getMessagePrefix(String symbolName) {
        return "symbol '" + (symbolName != null ? symbolName : "") + "': ";
    }
}
