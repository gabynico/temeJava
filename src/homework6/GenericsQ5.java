package homework6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ns on 2/6/2016.
 */
public class GenericsQ5 {

    public void meth(List<Object> l){
        for( Object o: l){
            System.out.println(o);
        }
    }

    public void meth_ok(List<? super  String> l){
        for( Object o: l){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        GenericsQ5 g = new GenericsQ5();
        List<Object> l1 = new ArrayList<>();
        l1.add("a");
        l1.add("b");

        g.meth(l1);

        List<String> l2 = new ArrayList<>();
        l2.add("c");
        l2.add("d");

        //g.meth(l2);
        //'meth(java.util.List<java.lang.Object>)' in 'homework6.GenericsQ5' cannot be applied to '(java.util.List<java.lang.String>)'

        l1.clear();
        l2.clear();

        l1.add("a_ok");
        l1.add("b_ok");
        l2.add("c_ok");
        l2.add("d_ok");

        g.meth_ok(l1);
        g.meth_ok(l2);

    }
}
