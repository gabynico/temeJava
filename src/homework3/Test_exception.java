package homework3;

/**
 * Created by ns on 1/29/2016.
 */
public class Test_exception {

    private static int getI() {
        int i = 0;
        try {
            System.out.println("i is " + ++i);
            i++;
            try {
                throw new Exception("Now i is " + i++);
            }
            catch (Throwable t) {
                i++;
            }
        }
        finally {
            System.out.println("finally i is " + i++);
            return i++;
        }
    }


    public static void main(String[] args) {
        int i = getI();
        System.out.println(i);

    }
}
