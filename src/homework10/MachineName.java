package homework10;

import java.net.InetAddress;

public class MachineName {

    public static void main(String[] args) throws Exception {
//        if (args.length != 1) {
//            System.err.println("Usage: WhoAmI MachineName");
//            System.exit(1);
//        }
        InetAddress a = InetAddress.getByName("localhost");
        System.out.println(a);
    }

    //C:\ns\JavaCourse\teme\out\production\teme\homework10>java MachineName BV-L-NICOLETA
}
