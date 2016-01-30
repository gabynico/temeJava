package homework3;

/**
 * Created by ns on 1/30/2016.
 */
public class C22 {
        /*  This creates an anonymous inner class: */
        static C2 c2 = new  C2( 1, 2) {
            public void print() {
                System.out.println("C2 - anonymous");
            }
        };

    public static void main(String[] args) {
        c2.print();
    }
}
