package homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListsTest {

    public static void printArrayList(ArrayList<String> list){
        for(String l : list){
            System.out.print( l);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        //    a.	creates two ArrayLists each with at least three elements (call them a and b)
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        //printArrayList(a);
        ArrayList<String> b = new ArrayList<>();
        b.add("v");
        b.add("x");
        b.add("y");
        b.add("z");
        //printArrayList(b);

        //    b.	merges b into a in an interleaved fashion (so if a=[a,b,c] and b=[w,x,y,z], then a becomes [a, w, b, x, c, y, z])
        String[] a_array = a.toArray(new String[a.size()]);
        String[] b_array = b.toArray(new String[b.size()]);

        ArrayList<String> c = new ArrayList<>();

        int lengthMax = a_array.length;
        if (lengthMax < b_array.length){
            lengthMax = b_array.length;
        }

        for(int i = 0; i < lengthMax ; i++){
            if (i< a_array.length){
                c.add( a_array[i]);
            }
            if (i< b_array.length){
                c.add( b_array[i]);
            }
        }
        a.clear();
        a.addAll(c);
        printArrayList(a);

        int j = 1;
        int cnt_remove = 0;
        c.clear();
        c.addAll(b);
        //    c.	removes every second element from b (so b would become [w,y])
        for(String ignored : c){
            if (j%2 == 0) {
                b.remove(j -1 - cnt_remove );
                cnt_remove++;
            }
            j++;
        }
        printArrayList(b);

        //    d.	finally removes from a every element that is in b (so a would become [a, b, x, c, z])
        int k;

        for(String ll : b){
            List sublist = Arrays.asList(ll);
            k = Collections.indexOfSubList(a, sublist);
            if (k > 0){
                a.remove(k);
            }
        }
        printArrayList(a);


    }
}
