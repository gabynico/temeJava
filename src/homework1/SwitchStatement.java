package homework1;

/**
 * Created by ns on 1/26/2016.
 */
public class SwitchStatement {

    public static void main (String[] args) throws java.lang.Exception
    {
        int s = 0;
        for (int i = 0; i < 3; ++i){
            switch (i) {
                case 0:  System.out.println("0");
                    //break;
                case 1:  System.out.println("1");
                    //break;
                case 2:  System.out.println("2");
                    //break;
                default: System.out.println(">=3");
                    //break;
            }
        }
    }
}