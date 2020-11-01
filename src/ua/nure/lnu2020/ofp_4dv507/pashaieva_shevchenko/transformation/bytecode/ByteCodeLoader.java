package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.transformation.bytecode;

import java.lang.reflect.InvocationTargetException;

public class ByteCodeLoader extends ClassLoader {
    public void load(byte[] code, String className){
        Class<?> exampleClass = this.defineClass(className, code, 0, code.length);
        resolveClass(exampleClass);
        try {
            exampleClass.getMethods()[0].invoke(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
