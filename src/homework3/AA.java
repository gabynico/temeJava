package homework3;

/**
 * Created by ns on 1/30/2016.
 */
public class AA {
    private static int x = 10;

    private static class B {
        private int x = 20;
        public void f() {
            System.out.println(AA.x);
        }
    }

    public static void main(String[] args) {
        AA.B a = new AA.B();
        a.f();
    }
}
