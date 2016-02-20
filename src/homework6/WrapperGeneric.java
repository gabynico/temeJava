package homework6;

public class WrapperGeneric<T> {

    private T ref;

    public WrapperGeneric(T ref) {
        this.ref = ref;
    }
    public T get() {
        return ref;
    }
    public void set(T a) {
        this.ref = ref;
    }

    public static void main(String[] args) {
        WrapperGeneric<String> greetingWrapper = new WrapperGeneric<String>("Hello");

        greetingWrapper.set("Hi"); // OK to pass a String
        String greeting = greetingWrapper.get(); // No need to cast

        // A compile-time error. You can use greetingWrapper only to store a String.
        //greetingWrapper.set(new Integer(101));


        Long i = Long.valueOf(987654321);
        WrapperGeneric<Number> wrp = new WrapperGeneric<Number>(i);

        Integer j = 123;
        wrp.set(j);

    }
}
