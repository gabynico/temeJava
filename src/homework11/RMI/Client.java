package homework11.RMI;

import java.rmi.Naming;

public class Client {


    public static void main(String args[] ) throws Exception{
//        if (System.getSecurityManager() == null) {
//            System.setSecurityManager(new SecurityManager());
//        }
        try {
//            Registry registry = LocateRegistry.getRegistry(args[0]);
//            AddInterface obj = (AddInterface) registry.lookup("ADD");
            AddInterface obj = (AddInterface) Naming.lookup("ADD");

            String t = obj.add("hello", "word");

            System.out.println("Concat = " + t);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
