package homework7;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by ns on 2/12/2016.
 */
public class Account implements Externalizable {

    private String id;
    private String psw;

    public Account() {
    }
    public Account(String id, String psw) {
        this.id = id;
        this.psw = psw;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(this.id);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.id = in.readUTF();
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}
