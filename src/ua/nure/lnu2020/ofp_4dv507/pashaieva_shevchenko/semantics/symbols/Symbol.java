package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

public abstract class Symbol {
    protected final OfpType type;
    protected final String name;

    public OfpType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Symbol(OfpType type, String name) {
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        }
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
