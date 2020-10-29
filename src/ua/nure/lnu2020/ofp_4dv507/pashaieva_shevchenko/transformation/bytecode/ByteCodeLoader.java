package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.bytecode;

import java.lang.reflect.InvocationTargetException;

public class ByteCodeLoader extends ClassLoader {
    public void load(byte[] code){
        Class<?> exampleClass = this.defineClass("Program", code, 0, code.length);
        try {
            exampleClass.getMethods()[0].invoke(null, new Object[] { null });
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
