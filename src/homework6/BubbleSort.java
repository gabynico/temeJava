package homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ns on 1/31/2016.
 */
public class BubbleSort {
   
    public <E extends Comparable<? super E> > void sortMeth( List<E> list){
        boolean changed = false;
        do{
            changed = false;
            for (int i = 0; i < list.size() - 1; i ++){
                if (list.get(i).compareTo(list.get(i +1)) > 0){
                    Collections.swap(list,i, i+1);
                    changed = true;
                }
            }
        }while(changed == true);
    }

   
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(7);
        a.add(5);
        a.add(1);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortMeth(a);
        System.out.println(a.toString());


        ArrayList<String> aa = new ArrayList<String>();
        aa.add("ffffff");
        aa.add("ddddddd");
        aa.add("aaaaaaa");
        aa.add("xxx");
        aa.add("aaaaa");

        BubbleSort bubbleString = new BubbleSort();
        bubbleString.sortMeth(aa);
        System.out.println(aa.toString());

    }
}

