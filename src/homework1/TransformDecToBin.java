package homework1;

/**
 * Created by ns on 1/26/2016.
 */
public class TransformDecToBin {
    public static void main (String[] args) throws java.lang.Exception
    {
        int s = 11;
        String res ="";

        while(s > 0){
            res =  s%2 + res;
            s /= 2;
        }
        System.out.println(Integer.parseInt( res ));
    }
}
