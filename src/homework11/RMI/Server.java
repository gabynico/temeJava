package homework11.RMI;

import java.rmi.Naming;

public class Server {

    public static void main(String args[] ) throws Exception{
//        if (System.getSecurityManager() == null) {
//            System.setSecurityManager(new SecurityManager());
//        }
        try {
            AddClass objRemote = new AddClass();
            //AddClass stub = (AddClass) UnicastRemoteObject.exportObject(objRemote, 1099);

//            Registry registry = LocateRegistry.getRegistry();
//            registry.rebind("ADD", objRemote);
             Naming.rebind("ADD", objRemote);

            System.out.println("Server started");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
