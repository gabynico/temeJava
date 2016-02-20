package homework4;

import java.util.ArrayList;


/**
 * Created by ns on 2/5/2016.
 */
public class MyObject implements Cloneable {
    int i;

    MyObject(int ii) {
        i = ii;
    }

    //[ZP] why the rename?
    public String toStringMy() {
        return Integer.toString(i);
    }


    public Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        return o;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject x = new MyObject(6);

        System.out.println(x.toStringMy());

        MyObject y = (MyObject)x.clone();

        System.out.println(y.toStringMy());

    }
}
