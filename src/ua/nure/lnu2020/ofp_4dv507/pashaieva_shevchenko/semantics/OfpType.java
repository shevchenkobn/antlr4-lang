package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.semantics;

import java.util.HashMap;
import java.util.Map;

public enum OfpType {
    INT("int"), FLOAT("float"), CHAR("char"), BOOL("bool"),
    STRING("string"),
    INT_ARR("int[]"), FLOAT_ARR("float[]"), CHAR_ARR("char[]"),
    VOID("void");

    private static final Map<String, OfpType> typesByName = new HashMap<>();

    private final String name;

    public String getName() {
        return name;
    }

    static {
        for (var type : values()) {
            typesByName.put(type.name, type);
        }
    }

    OfpType(String typeName) {
        this.name = typeName;
    }

    public static OfpType getByName(String typeName) {
        return typesByName.get(typeName);
    }

    @Override
    public String toString() {
//        return "OfpType{" +
//                "name='" + name + '\'' +
//                '}';
        return name;
    }
}
