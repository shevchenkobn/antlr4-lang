package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.python;

import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.DuplicateSymbolException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.OfpSourceCodeException;
import ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics.exceptions.SymbolNotDeclaredException;

import java.util.*;
import java.util.stream.Stream;

public class PythonIdController {
    private static final Set<String> reservedIds = new HashSet<>(Arrays.asList("False", "None", "True", "and", "as", "assert", "async", "await", "break", "class", "continue", "def", "del", "elif", "else", "except", "finally", "for", "from", "global", "if", "import", "in", "is", "lambda", "nonlocal", "not", "or", "pass", "raise", "return", "try", "while", "with", "yield", "ArithmeticError", "AssertionError", "AttributeError", "BaseException", "BlockingIOError", "BrokenPipeError", "BufferError", "BytesWarning", "ChildProcessError", "ConnectionAbortedError", "ConnectionError", "ConnectionRefusedError", "ConnectionResetError", "DeprecationWarning", "EOFError", "Ellipsis", "EnvironmentError", "Exception", "False", "FileExistsError", "FileNotFoundError", "FloatingPointError", "FutureWarning", "GeneratorExit", "IOError", "ImportError", "ImportWarning", "IndentationError", "IndexError", "InterruptedError", "IsADirectoryError", "KeyError", "KeyboardInterrupt", "LookupError", "MemoryError", "NameError", "None", "NotADirectoryError", "NotImplemented", "NotImplementedError", "OSError", "OverflowError", "PendingDeprecationWarning", "PermissionError", "ProcessLookupError", "RecursionError", "ReferenceError", "ResourceWarning", "RuntimeError", "RuntimeWarning", "StopAsyncIteration", "StopIteration", "SyntaxError", "SyntaxWarning", "SystemError", "SystemExit", "TabError", "TimeoutError", "True", "TypeError", "UnboundLocalError", "UnicodeDecodeError", "UnicodeEncodeError", "UnicodeError", "UnicodeTranslateError", "UnicodeWarning", "UserWarning", "ValueError", "Warning", "ZeroDivisionError", "__build_class__", "__debug__", "__doc__", "__import__", "__loader__", "__name__", "__package__", "__spec__", "abs", "all", "any", "ascii", "bin", "bool", "bytearray", "bytes", "callable", "chr", "classmethod", "compile", "complex", "copyright", "credits", "delattr", "dict", "dir", "divmod", "enumerate", "eval", "exec", "exit", "filter", "float", "format", "frozenset", "getattr", "globals", "hasattr", "hash", "help", "hex", "id", "input", "int", "isinstance", "issubclass", "iter", "len", "license", "list", "locals", "map", "max", "memoryview", "min", "next", "object", "oct", "open", "ord", "pow", "print", "property", "quit", "range", "repr", "reversed", "round", "set", "setattr", "slice", "sorted", "staticmethod", "str", "sum", "super", "tuple", "type", "vars", "zip"));
    private final Map<String, PythonId> functionNames;
    private final Deque<Map<String, PythonId>> scopes = new LinkedList<>();

    PythonIdController(int functionCount) {
        functionNames = new HashMap<>(functionCount);
    }

    public void defineFunction(String functionName) {
        if (functionNames.containsKey(functionName)) {
            throw new DuplicateSymbolException(functionName);
        }
        putFunctionName(functionName);
    }

    public String resolveFunction(String functionName) {
        if (functionNames.containsKey(functionName)) {
            return functionNames.get(functionName).getId();
        }
        return putFunctionName(functionName);
    }

    public void enterScope() {
        scopes.push(new HashMap<>());
    }

    public void exitScope() {
        assertNonEmpty();
        scopes.pop();
    }

    public void defineVariable(String variableName) {
        assertNonEmpty();
        var currentScope = scopes.peek();
        if (currentScope.containsKey(variableName)) {
            throw new DuplicateSymbolException(variableName);
        }
        PythonId overriddenId = null;
        Iterable<Map<String, PythonId>> iterable = scopes.stream().skip(1)::iterator;
        var appendIndex = false;
        for (var enclosingScope : iterable) {
            if (enclosingScope.containsKey(variableName)) {
                overriddenId = enclosingScope.get(variableName);
                break;
            }
        }
        if (overriddenId == null) {
            overriddenId = functionNames.getOrDefault(variableName, null);
            appendIndex = overriddenId != null;
        } else {
            appendIndex = overriddenId.getIndex() >= 1;
        }
        var newId = new PythonId(variableName, overriddenId == null ? 1 : overriddenId.getIndex() + 1, appendIndex);
        currentScope.put(variableName, newId);
    }

    public String resolveVariable(String variableName) {
        assertNonEmpty();
        for (var scope : scopes) {
            if (scope.containsKey(variableName)) {
                return scope.get(variableName).getId();
            }
        }
        throw new SymbolNotDeclaredException(variableName);
    }

    public Stream<Map.Entry<String, PythonId>> getScopeDefinedVariables() {
        assertNonEmpty();
        return scopes.peek().entrySet().stream();
    }

    private static String getSafeId(String id) {
        return reservedIds.contains(id) ? "ofp_" + id : id;
    }

    private String putFunctionName(String functionName) {
        var safeId = new PythonId(functionName, 0, false);
        functionNames.put(functionName, safeId);
        return safeId.getId();
    }

    private void assertNonEmpty() {
        if (scopes.isEmpty()) {
            throw new OfpSourceCodeException("Not inside any function");
        }
    }

    public static class PythonId {
        private final String id;
        private final int index;

        public PythonId(String baseId, int index, boolean appendIndex) {
            this.id = getSafeId(appendIndex ? baseId + "_" + index : baseId);
            this.index = index;
        }

        public String getId() {
            return id;
        }

        public int getIndex() {
            return index;
        }
    }
}
