package homework2;

/**
 * Created by ns on 1/26/2016.
 */
public class DeriveClass2 extends AbstractClassDemo2 {

    public void m1(){
        System.out.println("DeriveClass2.abstract-m1");
    }

    static void m2( AbstractClassDemo2 a) {
        a.m1();
    }

    public static void main(String[] args) {

        DeriveClass2 x = new DeriveClass2();
        x.m2(x);
    }

}