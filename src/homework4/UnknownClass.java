package homework4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ns on 2/4/2016.
 */
//[ZP] p2 - 0 , you are not working with the given class, the class wasn't created with reflection
//[ZP] p3 - 5 the hidden value is read but is not set again
public class UnknownClass {

	//[ZP] for fields declaration we are using java code style camelCase hiddenAttribute
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


    //[ZP] very hard to read the code, to many try catch blocks
    //[ZP] please solve the compilation warnings
    
    public static void main(String[] args) {
        Class reflectClass = UnknownClass.class;

        System.out.println(reflectClass.getName());

        Constructor constructor = null;
        try {
            constructor = reflectClass.getConstructor(int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Class[] constructParameters = constructor.getParameterTypes();
        for(Class parameter : constructParameters){
                System.out.println(parameter.getName());
        }

        Object reflectObj = null;
        try {
            reflectObj = constructor.newInstance(6);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Field privateAttributName = null;
        try {
            privateAttributName = UnknownClass.class.getDeclaredField("hidden_attribut");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateAttributName.setAccessible(true);

        int valueOfField = 0;

        try {
            valueOfField = (int) privateAttributName.get(reflectObj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        System.out.println(new StringBuilder().append("Private attribut value: ").append(valueOfField).toString());


        try {
            privateAttributName.setInt(reflectObj, 20);

            valueOfField = (int) privateAttributName.get(reflectObj);


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(new StringBuilder().append("Private attribut value after change: ").append(valueOfField).toString());






        String methodName = "returnStringValue";
        //[ZP] this object should be created with reflection
        UnknownClass obj = new UnknownClass(11);

        Method privateMethod = null;
        try {
            privateMethod = UnknownClass.class.getDeclaredMethod(methodName, null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // Shuts down security allowing you to access private methods
        privateMethod.setAccessible(true);

          // get the return value from the method
        String privateReturnVal = null;
        try {
            privateReturnVal = (String) privateMethod.invoke(obj, null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("Private Method execute: " + privateReturnVal);


    }
}
