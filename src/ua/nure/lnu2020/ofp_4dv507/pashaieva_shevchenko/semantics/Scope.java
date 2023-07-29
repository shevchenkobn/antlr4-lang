package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

import org.antlr.v4.runtime.tree.ParseTree;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.DuplicateSymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolNotDeclaredException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.symbols.Symbol;

import java.io.IOException;
import java.util.*;

public class Scope<S extends Symbol> {
    /**
     * null if global (outermost) scope
     */
    private final Scope<S> enclosingScope;
    private final Map<ParseTree, Scope<S>> enclosedScopes = new HashMap<>();
    private final Map<String, S> symbols = new LinkedHashMap<>();
    private final SymbolFactory<S> symbolFactory;

    public Scope<S> getEnclosingScope() {
        return enclosingScope;
    }

    public Collection<Scope<S>> getEnclosedScopes() {
        return enclosedScopes.values();
    }

    public Scope<S> getEnclosedScope(ParseTree parseTree) {
        return enclosedScopes.get(parseTree);
    }

    public Scope(Scope<S> enclosingScope, ParseTree parseTree, SymbolFactory<S> symbolFactory) {
        this.enclosingScope = enclosingScope;
        if (this.enclosingScope != null) {
            this.enclosingScope.enclosedScopes.put(parseTree,this);
        }
        if (symbolFactory == null) {
            throw new NullPointerException("symbol factory");
        }
        this.symbolFactory = symbolFactory;
    }

    public int size() {
        return symbols.size();
    }

    public Collection<S> getSymbols() {
        return symbols.values();
    }

    public void define(S sym) throws DuplicateSymbolException {
        if (symbols.containsKey(sym.getName())) {
            throw new DuplicateSymbolException(sym.getName());
        }
        symbols.put(sym.getName(), sym);
    }

    public S get(String name) {
        return symbols.get(name);
    }

    public S tryResolve(String name) {
        try {
            return resolve(name);
        } catch (SymbolNotDeclaredException exception) {
            return symbolFactory.apply(null, name);
        }
    }

    /**
     * If a name cannot be resolved in this scope,
     * try enclosing/parent scope recursively.
     */
    public S resolve(String name) throws SymbolNotDeclaredException {
        if (symbols.containsKey(name)) {
            return symbols.get(name);
        }
        if (enclosingScope == null) {
            throw new SymbolNotDeclaredException(name);
        }
        return enclosingScope.resolve(name);
    }

    public void toAppendable(Appendable appendable, boolean pretty, CharSequence indentation, CharSequence indentationItem) throws IOException {
        toAppendable(appendable, pretty, true, true, indentation, indentationItem);
    }

    private void toAppendable(Appendable appendable, boolean pretty, boolean goUp, boolean goDown, CharSequence indentation, CharSequence indentationItem) throws IOException {
        appendable.append(getClass().getSimpleName()).append('{');
        String humanIndent = indentation.toString() + indentationItem.toString() + indentationItem;
        if (goUp && enclosingScope != null) {
            if (pretty) {
                appendable.append("\n").append(indentation).append(indentationItem);
            }
            appendable.append("enclosingScope=");
            enclosingScope.toAppendable(
                    appendable,
                    pretty,true,
                    false,
                    pretty ? humanIndent : indentation,
                    indentationItem);
            appendable.append(',');
            if (!pretty) {
                appendable.append(' ');
            }
        }
        if (pretty) {
            appendable.append('\n').append(indentation).append(indentationItem);
        }
        if (symbols.size() > 0) {
            appendable.append("symbols=[");
            var first = true;
            for (var symbol : symbols.values()) {
                if (!first) {
                    appendable.append(',');
                }
                if (pretty) {
                    appendable.append("\n").append(indentation).append(indentationItem).append(indentationItem);
                } else {
                    appendable.append(" ");
                }
                appendable.append(symbol.toString());
                first = false;
            }
            if (pretty) {
                appendable.append("\n").append(indentation).append(indentationItem);
            } else {
                appendable.append(" ");
            }
            appendable.append("]");
        } else {
            appendable.append("symbols=[]");
        }
        if (goDown) {
            appendable.append(',');
            if (pretty) {
                appendable.append('\n').append(indentation).append(indentationItem);
            } else {
                appendable.append(' ');
            }
            if (enclosedScopes.size() > 0) {
                appendable.append("enclosedScopes=[");
                var first = true;
                for (var scope : enclosedScopes.values()) {
                    if (!first) {
                        appendable.append(',');
                    }
                    if (pretty) {
                        appendable.append("\n").append(indentation).append(indentationItem).append(indentationItem);
                    } else {
                        appendable.append(" ");
                    }
                    scope.toAppendable(
                            appendable,
                            pretty,
                            false,
                            true,
                            pretty ? humanIndent : indentation,
                            indentationItem);
                    first = false;
                }
                if (pretty) {
                    appendable.append("\n").append(indentation).append(indentationItem);
                } else {
                    appendable.append(" ");
                }
                appendable.append("]");
            } else {
                appendable.append("enclosedScopes=[]");
            }
        }
        if (pretty) {
            appendable.append('\n').append(indentation);
        }
        appendable.append('}');
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder("Scope{");
        if (enclosingScope != null) {
            stringBuilder.append("enclosingScope=")
                    .append("Scope@").append(Integer.toHexString(enclosingScope.hashCode())).append(", ");
        }
        return stringBuilder
                .append("symbols=Array[")
                .append(symbols.size()).append("], enclosedScopes=Array[")
                .append(enclosedScopes.size()).append("]}").toString();
    }

    @FunctionalInterface
    public interface SymbolFactory<S> {
        S apply(OfpType type, String name);
    }
}
