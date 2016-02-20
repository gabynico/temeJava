package homework4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UnknownClass {

    private int hidden_attribut;

    public void printValue() {
        System.out.println(this.hidden_attribut);
    }


    public String returnStringValue() {
        return "string + " + this.hidden_attribut;
    }

    public UnknownClass(int i) {
        this.hidden_attribut = i + 1;
        System.out.println(this.hidden_attribut);
    }


    public static void main(String[] args) {
        Class reflectClass = UnknownClass.class;

        System.out.println(reflectClass.getName());

        Constructor constructor = null;
        try {
            constructor = reflectClass.getConstructor(int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Class[] constructParameters = new Class[0];
        if (constructor != null) {
            constructParameters = constructor.getParameterTypes();
        }
        for(Class parameter : constructParameters){
                System.out.println(parameter.getName());
        }

        Object reflectObj = null;
        try {
            reflectObj = constructor.newInstance(6);

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e  ) {
            e.printStackTrace();
        }

        Field privateAttributName = null;
        try {
            privateAttributName = UnknownClass.class.getDeclaredField("hidden_attribut");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        if (privateAttributName != null) {
            privateAttributName.setAccessible(true);
        }

        int valueOfField = 0;

        try {
            if (privateAttributName != null) {
                valueOfField = (int) privateAttributName.get(reflectObj);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        System.out.println("Private attribut value: " + valueOfField);


        try {
            if (privateAttributName != null) {
                privateAttributName.setInt(reflectObj, 20);
            }

            if (privateAttributName != null) {
                valueOfField = (int) privateAttributName.get(reflectObj);
            }


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("Private attribut value after change: " + valueOfField);






        String methodName = "returnStringValue";
        UnknownClass obj = new UnknownClass(11);

        Method privateMethod = null;
        try {
            privateMethod = UnknownClass.class.getDeclaredMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // Shuts down security allowing you to access private methods
        if (privateMethod != null) {
            privateMethod.setAccessible(true);
        }

        // get the return value from the method
        String privateReturnVal = null;
        try {
            if (privateMethod != null) {
                privateReturnVal = (String) privateMethod.invoke(obj);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("Private Method execute: " + privateReturnVal);


    }
}
