package homework11.RMI;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddClass extends UnicastRemoteObject implements AddInterface, Serializable {

    public AddClass() throws RemoteException {
        super();
    }

    @Override
    public String add(String x, String y) throws RemoteException {
        return x + y;
    }


}
