package it.cascella.enums.singletonEnum;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Main.class.getMethod("ciao").invoke(null);
        Main m = new Main();
        m.ciao(null);

    }
    public void ciao(Object a, Object ... b) {
        System.out.println("ciao");
    }
       
}
