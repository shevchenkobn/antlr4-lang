package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions;

public class OfpSourceCodeException extends IllegalStateException {
    int sourceCodeLine = -1;
    int sourceCodeCharacterInLineIndex = -1;

    public int getSourceCodeLine() {
        return sourceCodeLine;
    }

    public int getSourceCodeCharacterInLineIndex() {
        return sourceCodeCharacterInLineIndex;
    }

    public void setSourceCodeLine(int sourceCodeLine) {
        this.sourceCodeLine = sourceCodeLine;
    }

    public void setSourceCodeCharacterInLineIndex(int sourceCodeCharacterInLineIndex) {
        this.sourceCodeCharacterInLineIndex = sourceCodeCharacterInLineIndex;
    }

    public OfpSourceCodeException(String message) {
        super(message);
    }

    public OfpSourceCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String toString() {
        if (sourceCodeLine <= 0) {
            if (sourceCodeCharacterInLineIndex >= 0) {
                return String.format("character %d %s", sourceCodeCharacterInLineIndex, toStringDo());
            }
        }
        if (sourceCodeCharacterInLineIndex < 0) {
            if (sourceCodeLine > 0) {
                return String.format("line %d %s", sourceCodeLine, toStringDo());
            }
        }
        if (sourceCodeLine > 0 && sourceCodeCharacterInLineIndex >= 0) {
            return String.format("line %d:%d %s", sourceCodeLine, sourceCodeCharacterInLineIndex, toStringDo());
        }
        return toStringDo();
    }

    protected String toStringDo() {
        return getClass().getSimpleName() + ": " + getMessage();
    }
}
