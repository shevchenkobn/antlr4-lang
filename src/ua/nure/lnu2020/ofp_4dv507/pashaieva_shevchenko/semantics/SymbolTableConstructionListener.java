package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoBaseListener;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoParser;

public class SymbolTableBuilderListener extends OfpPashaievaShevchenkoBaseListener {
    private final FunctionMap functions = new FunctionMap();
    private Scope<VariableSymbol> scope;

    public FunctionMap getFunctions() {
        return functions;
    }

    @Override
    public void enterMainDef(OfpPashaievaShevchenkoParser.MainDefContext ctx) {
        super.enterMainDef(ctx);
    }
}
