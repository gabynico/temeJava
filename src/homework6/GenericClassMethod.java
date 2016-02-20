package homework6;


import java.util.ArrayList;

public class GenericClassMethod <T> {

    private T ref;

    public GenericClassMethod(T ref) {
        this.ref = ref;
    }

//    public void genericMethod1(E ref) {
//        E f;
//        f = ref;
//    }

    public void genericMethod2(ArrayList<Object> list) {
        for(Object l : list){
            System.out.print( l);
        }
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
