package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;

public class CachingConsoleErrorListener extends ConsoleErrorListener {
    protected ArrayList<SyntaxError> errors = new ArrayList<>();

    public ArrayList<SyntaxError> getErrors() {
        return errors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        this.errors.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e));
    }

    public static class SyntaxError {
        private final Recognizer<?, ?> recognizer;
        private final Object offendingSymbol;
        private final int line;
        private final int charPositionInLine;
        private final String msg;
        private final RecognitionException exception;

        public Recognizer<?, ?> getRecognizer() {
            return recognizer;
        }
        public Object getOffendingSymbol() {
            return offendingSymbol;
        }
        public int getLine() {
            return line;
        }
        public int getCharPositionInLine() {
            return charPositionInLine;
        }
        public String getMsg() {
            return msg;
        }
        public RecognitionException getException() {
            return exception;
        }

        public SyntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException exception) {
            this.recognizer = recognizer;
            this.offendingSymbol = offendingSymbol;
            this.line = line;
            this.charPositionInLine = charPositionInLine;
            this.msg = msg;
            this.exception = exception;
        }
    }
}
