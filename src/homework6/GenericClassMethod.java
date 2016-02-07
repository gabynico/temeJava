package homework6;

/**
 * Created by ns on 2/7/2016.
 */
public class GenericClassMethod <T> {

    private T ref;

    public GenericClassMethod(T ref) {
        this.ref = ref;
    }
    public T get() {
        return ref;
    }
    public void set(T a) {
        this.ref = ref;
    }

    public static void main(String[] args) {

        Long i = Long.valueOf(987654321);
        GenericClassMethod<Number> wrp = new GenericClassMethod<Number>(i);

        Integer j = 123;
        wrp.set(j);

    }
}
