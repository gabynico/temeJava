package homework2;

/**
 * Created by ns on 1/26/2016.
 */
public class DeriveClass extends AbstractClassDemo {
    private void m1(){
        System.out.println("DeriveClass.m1");
    }
    static void m2( AbstractClassDemo a) {
        DeriveClass d = (DeriveClass)a;
        d.m1();
    }

    public static void main(String[] args) {

//        DeriveClass x = new DeriveClass();
    	
    	AbstractClassDemo x = new DeriveClass();
        DeriveClass.m2(x);
        DeriveClass.m2(new DeriveClass());
    }

}
