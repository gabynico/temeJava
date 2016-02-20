package homework1;

public class StaticClass2 {

    private static int cnt = 3;
    private static int a[];


    static{
        //cnt = 10;
        a = new int[cnt];
        for(int i =0; i< cnt; i++){
            a[i]=i;
        }
    }

    public void print() {
        System.out.println("cnt:" + cnt);
        for(int i =0; i< cnt; i++){
            System.out.println(a[i]);
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        StaticClass2 c = new StaticClass2();
        c.print();
    }
}
