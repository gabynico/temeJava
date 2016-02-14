package homework3;

/**
 * Created by ns on 1/29/2016.
 */
public class ExceptionMain {

    public static void throwException() throws Exception1, Exception2 {
        // method body not shown
    }

    public static void main(String[] args) {
        try {
            throwException();
        }
        catch (Exception1 e) {
            System.err.println("Caught Exception1");
        }
        catch (Exception2 e) {
            System.err.println("Caught Exception2");
        }

        try {
            throwException();
        }
        catch (Exception e) {
            // write your code here
        	//[ZP] you should print here "Caught Exception1" or "Caught Exception2"
            System.err.println("Caught Exception");
        }

    }
}
