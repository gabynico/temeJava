package homework3;

/**
 * Created by ns on 1/30/2016.
 */
public class C11 {
    /*  This creates an anonymous inner class: */
    static C1 c1 = new  C1() {
        public void print() {
            System.out.println("C2 - anonymous");
        }
    };

    public static void main(String[] args) {
        c1.print();
    }
}
