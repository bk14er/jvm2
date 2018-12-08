package pl.sda.jvm.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ListMethods {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> c = Class.forName("pl.sda.jvm.reflection.X");
        Constructor<?>[] constructors = c.getConstructors();
        Method[] methods = c.getMethods();

        X x = new X();

        for(Method method : c.getDeclaredMethods()){
            method.invoke(x,new Object[]{});
        }

        for(Field f: c.getDeclaredFields()){
            System.out.println(f.get(x));
        }


    }

}
