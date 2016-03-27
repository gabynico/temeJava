package homework11.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddInterface extends Remote{

    String add(String x, String y) throws RemoteException;
}
