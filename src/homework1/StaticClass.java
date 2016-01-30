package homework1;

/**
 * Created by ns on 1/26/2016.
 */
public class StaticClass {

    private static String str = "abc";

    private static int cnt1;
    private static int cnt2;

    static{
        cnt1 = 10;
        cnt2 = 20;
    }

    public void print() {
        System.out.println("cnt1:" + cnt1);
        System.out.println("cnt2:" + cnt2);
        System.out.println("str:" + str);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        StaticClass c = new StaticClass();
        c.print();

    }
}
