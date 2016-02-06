package homework4;

/**
 * Created by ns on 2/3/2016.
 */
public class StringUtil {

    public static String lowcase(String s) {
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        String q = "world is not ENOUGH";
        String qq = lowcase(q);
        String qqq = q.substring(q.indexOf("ENOUGH"));
        qqq.concat(" is not enough");  // method concat return a string that represents the concatenation of this object's characters followed by the string argument's characters
        System.out.println(q);
        System.out.println(qq);
        System.out.println(qqq);
    }
}
