package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

import org.antlr.v4.runtime.tree.ParseTree;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.FunctionSymbol;

import java.io.IOException;
import java.util.IdentityHashMap;

public class FunctionMap extends IdentityHashMap<ParseTree, FunctionSymbol> {
    public void toAppendable(Appendable appendable, boolean pretty) throws IOException {
        appendable.append("FunctionMap{");
        var first = true;
        for (var entry : entrySet()) {
            if (!first) {
                appendable.append(',');
            }
            if (pretty) {
                appendable.append('\n').append("\t");
            }
            appendable.append('`').append(entry.getKey().getChild(1).getText()).append("`: ");
            entry.getValue().getVariableScope().toAppendable(appendable, pretty, "\t", "\t");
            first = false;
        }
        if (pretty) {
            appendable.append('\n');
        }
        appendable.append('}');
        if (pretty) {
            appendable.append('\n');
        }
    }
}
