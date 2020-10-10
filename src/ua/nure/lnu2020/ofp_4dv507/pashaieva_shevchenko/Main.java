package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.OfpSourceCodeException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.listeners.BaseOfpListener;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.*;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.listeners.CheckRefListener;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.listeners.SymbolTableConstructionListener;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.visitors.TypeCheckingVisitor;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Read test program path from args
        // Or, for the file in the same working directory, simply: expr_input.txt
        if (args.length < 1) {
            System.err.println("Input file not provided!");
            System.exit(1);
        }
        String sourceFileName = args[0];
        System.out.println("Reading test program from: " + sourceFileName);

        try {
            var errorListener = new CachingConsoleErrorListener();
            var lexer = new OfpPashaievaShevchenkoLexer(CharStreams.fromFileName(sourceFileName));
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            var parser  = new OfpPashaievaShevchenkoParser(new BufferedTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            var programTree = parser.programDef();

            if (errorListener.getErrors().size() != 0) {
                System.err.printf("Failed to parse input file '%s'. See the errors above.\n", sourceFileName);
                System.exit(1);
            }

            // Building Symbol Table
            var walker = new ParseTreeWalker();
            var globalScope = new Scope<FunctionSymbol>(null, null);
            var foundErrors = false;

            for (BaseOfpListener listener : getListeners(globalScope)) {
                walker.walk(listener, programTree);
                if (listener instanceof SymbolTableConstructionListener) {
                    ((SymbolTableConstructionListener) listener).getFunctions().toAppendable(System.out, true);
                    System.out.println();
                }

                foundErrors = foundErrors | processErrors(listener.getErrors());
            }

            if (foundErrors){
                System.err.printf("Semantic errors in file '%s'. See the errors above.\n", sourceFileName);
                System.exit(1);
            }

            //Check types
            var visitor = new TypeCheckingVisitor(globalScope);
            visitor.visit(programTree);

            if (processErrors(visitor.getErrors())) {
                System.err.printf("Type inconsistency errors in file '%s'. See the errors above.\n", sourceFileName);
                System.exit(1);
            }

            System.out.println("\nOK");
        } catch (IOException exception) {
            System.err.println("Failed to read input file: " + sourceFileName);
            exception.printStackTrace();
            System.exit(1);
        }
    }

    private static BaseOfpListener[] getListeners(Scope<FunctionSymbol> globalScope){
        return new BaseOfpListener[] {
                new SymbolTableConstructionListener(globalScope),
                new CheckRefListener(globalScope)
        };
    }

    private static boolean processErrors(ArrayList<OfpSourceCodeException> errors){
        if (errors.size() == 0)
            return false;

        for (var exception : errors) {
            System.err.println(exception.toString());
        }

        return true;
    }
}
