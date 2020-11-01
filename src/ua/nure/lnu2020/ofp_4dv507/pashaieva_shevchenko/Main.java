package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.TraceClassVisitor;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.OfpSourceCodeException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.listeners.BaseOfpListener;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.*;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.listeners.CheckRefListener;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.listeners.SymbolTableConstructionListener;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.visitors.TypeCheckingVisitor;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.bytecode.ByteCodeLoader;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.bytecode.BytecodeGenerator;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.python.PythonCodeGenerator;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Read test program path from args
        // Or, for the file in the same working directory, simply: expr_input.txt
        if (args.length < 1) {
            System.err.println("Input file not provided!");
            System.out.println("The app accepts up to 2 arguments: the first one is *.ofp file, the second one is optional, an output transpiled file.\n" +
                    "If you provide an output file, make sure to provide an extension (e.g. output/python/test.py)");
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
            var globalScope = new Scope<>(null, null, FunctionSymbol::new);
            var foundErrors = false;

            for (BaseOfpListener listener : getListeners(globalScope)) {
                walker.walk(listener, programTree);
                if (listener instanceof SymbolTableConstructionListener) {
                    ((SymbolTableConstructionListener) listener).getFunctions().toAppendable(System.out, true);
                    System.out.println();
                }

                foundErrors |= processErrors(listener.getErrors());
            }

            //Check types
            var visitor = new TypeCheckingVisitor(globalScope);
            visitor.visit(programTree);
            foundErrors |= processErrors(visitor.getErrors());

            if (foundErrors){
                System.err.printf("Semantic errors in file '%s'. See the errors above.\n", sourceFileName);
                System.exit(1);
            }

            if (args.length > 1) {
                if (args[1].endsWith("py")) {
                    System.out.println("\nGenerating Python code...");
                    PythonCodeGenerator pythonGenerator;
                    try (var output = new FileWriter(args[1])) {
                        pythonGenerator = new PythonCodeGenerator(globalScope, output, visitor);
                        pythonGenerator.visit(programTree);
                        output.flush();
                    }

                    foundErrors = processErrors(pythonGenerator.getErrors(), "\n\nUnexpected errors during Python code generation:");
                }
                if (args[1].endsWith("class")){
                    System.out.println("\nGenerating Java bytecode...");
                    BytecodeGenerator bytecodeGenerator;
                    var file = new File(args[1]);
                    try (var output = new FileOutputStream(file)) {
                        var className = file.getName().replaceFirst("\\.[^.]+$", "");
                        bytecodeGenerator = new BytecodeGenerator(globalScope, className);
                        bytecodeGenerator.visit(programTree);
                        var cw = bytecodeGenerator.getClassWriter();
                        var code = cw.toByteArray();
                        // Diagnostics
                        ClassReader cr = new ClassReader(code);
                        ClassVisitor tracer = new TraceClassVisitor(new PrintWriter(System.out));
                        ClassVisitor checker = new CheckClassAdapter(tracer, true);
                        cr.accept(checker,0);

                        var cl = new ByteCodeLoader();
                        cl.load(code, className);
                        output.write(cw.toByteArray());
                        output.flush();
                    }

                    foundErrors = processErrors(bytecodeGenerator.getErrors(), "\n\nUnexpected errors during Java bytecode generation:");
                }
                else {
                    System.err.printf("Couldn't infer target language by file extension in '%s'\n", args[1]);
                    System.exit(1);
                }
            }

            if (foundErrors){
                System.exit(1);
            } else {
                System.out.println("OK");
            }
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

    private static boolean processErrors(ArrayList<OfpSourceCodeException> errors) {
        return processErrors(errors, null);
    }

    private static boolean processErrors(ArrayList<OfpSourceCodeException> errors, String headerMessage){
        if (errors.size() == 0)
            return false;

        if (headerMessage != null) {
            System.err.println(headerMessage);
        }
        for (var exception : errors) {
            System.err.println(exception.toString());
//            exception.printStackTrace();
        }

        return true;
    }
}
