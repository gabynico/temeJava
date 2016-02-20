package homework2;

public class DeriveClass2 extends AbstractClassDemo2 {

    public void m1(){
        System.out.println("DeriveClass2.abstract-m1");
    }

    static void m2( AbstractClassDemo2 a) {
        a.m1();
    }

    public static void main(String[] args) {

        DeriveClass2 x = new DeriveClass2();
        //x.m2(x);
        //[ZP] call to a static
        DeriveClass2.m2(x);
    }

}