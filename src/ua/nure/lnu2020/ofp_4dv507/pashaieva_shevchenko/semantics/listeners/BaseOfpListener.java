package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.listeners;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoBaseListener;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.OfpSourceCodeException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;

import java.util.ArrayList;

public abstract class BaseOfpListener extends OfpPashaievaShevchenkoBaseListener {
    final Scope<FunctionSymbol> globalScope;
    final ArrayList<OfpSourceCodeException> errors = new ArrayList<>();

    BaseOfpListener(Scope<FunctionSymbol> globalScope){
        this.globalScope = globalScope;
    }

    public ArrayList<OfpSourceCodeException> getErrors() {
        return errors;
    }
}
