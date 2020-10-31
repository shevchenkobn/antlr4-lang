package ua.nure.lnu2020.ofp_4dv507.exam.lisp;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ua.nure.lnu2020.ofp_4dv507.exam.lisp.parsing.LispExamLexer;
import ua.nure.lnu2020.ofp_4dv507.exam.lisp.parsing.LispExamParser;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.CachingConsoleErrorListener;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var errorListener = new CachingConsoleErrorListener();
        var listener = new LispExamPrintListener(System.out);
        var walker = new ParseTreeWalker();
        System.out.print("> ");
        while (input.hasNextLine()) {
            var lexer = new LispExamLexer(CharStreams.fromString(input.nextLine()));
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            var parser = new LispExamParser(new BufferedTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            var programTree = parser.programDef();

            if (errorListener.getErrors().size() != 0) {
                System.err.println("Failed to parse, see the errors above.");
                errorListener.getErrors().clear();
                continue;
            }
            walker.walk(listener, programTree);
            System.out.print("> ");
        }
    }
}
