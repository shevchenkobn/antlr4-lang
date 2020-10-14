package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.python;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoParser;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.visitors.BaseOfpVisitor;

import java.util.HashMap;
import java.util.Map;

public class PythonCodeGenerator extends BaseOfpVisitor<Void> {
    private final PythonIdController idController;
    private final Appendable output;
    private int depth = 0;
    private final Map<Integer,String> indentCache = new HashMap<Integer,String>();
    private OfpPashaievaShevchenkoParser.MainDefContext main;

    public PythonCodeGenerator(Scope<FunctionSymbol> globalScope, Appendable output) {
        super(globalScope);
        idController = new PythonIdController(globalScope.size());
        this.output = output;
    }

    @Override
    public Void visitProgramDef(OfpPashaievaShevchenkoParser.ProgramDefContext ctx) {
        super.visitProgramDef(ctx);
        visitMainDef(main);
        return null;
    }

    @Override
    public Void visitFuncDef(OfpPashaievaShevchenkoParser.FuncDefContext ctx) {
        return super.visitFuncDef(ctx);
    }
    private String indent(int indentLevel) {
        return indentCache.computeIfAbsent(indentLevel, "    "::repeat);
    }
}
