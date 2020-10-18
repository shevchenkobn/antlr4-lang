package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.visitors;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing.OfpPashaievaShevchenkoBaseVisitor;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.OfpType;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.Scope;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.OfpSourceCodeException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;

import java.util.ArrayList;

public abstract class BaseOfpVisitor<T> extends OfpPashaievaShevchenkoBaseVisitor<T> {
    protected final Scope<FunctionSymbol> globalScope;
    protected final ArrayList<OfpSourceCodeException> errors = new ArrayList<>();

    protected BaseOfpVisitor(Scope<FunctionSymbol> globalScope){
        this.globalScope = globalScope;
    }

    public ArrayList<OfpSourceCodeException> getErrors() {
        return errors;
    }
}
