package homework3;

/**
 * Created by ns on 1/29/2016.
 */
public class RandomPlay {

    private static int cnt;
    private static boolean err;

    private static void meth() throws Exception {
        double r1 = 10 * java.lang.Math.random(); // random() returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
        double r2 = 10 * java.lang.Math.random();

        //if the difference of the 2 numbers is higher than 3, throw an exception you�ll specially define for this case
        if(java.lang.Math.abs(r1 - r2) > 3){
            throw new Exception("Difference of the 2 random numbers is higher than 3");
        }
    }

    //add a main() method to class RandomPlay that repeatedly calls the first method until it throws no exception
    public static void main(String[] args) {
        err = true;
        while(err){
            try {
                err = false;
                meth();
            } catch (Exception e) {
                e.printStackTrace();
                cnt++;
                err = true;
            }
        }
        System.out.println("The first method threw " + cnt + " exceptions.");
        //exit the program by printing the number of times the first method threw your exception
    }

}
