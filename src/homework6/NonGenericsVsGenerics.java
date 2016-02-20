package homework6;

import java.util.ArrayList;

public class NonGenericsVsGenerics {

    public void meth_generic(ArrayList<String> l){
        for( Object o: l){
            System.out.println(o);
        }
    }

    public void meth_non_generic(ArrayList l){
        for( Object o: l){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        NonGenericsVsGenerics cls = new NonGenericsVsGenerics();

        ArrayList ng =new ArrayList();//creating old non-generic arraylist
        ArrayList<String> g=new ArrayList<String>();//creating new generic arraylist

        ng.add("1");
        ng.add("2");
        ng.add("3");

        g.add("a");
        g.add("b");

        cls.meth_generic(ng);
        cls.meth_non_generic(ng);
        cls.meth_generic(g);
        cls.meth_non_generic(g);



    }
}
