package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

import org.antlr.v4.runtime.tree.ParseTree;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;

import java.util.IdentityHashMap;

// FIXME: They recommend such a class, but I don't see the point
public class FunctionMap extends IdentityHashMap<ParseTree, FunctionSymbol> {}
