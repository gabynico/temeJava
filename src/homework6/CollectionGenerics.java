package homework6;

/**
 * Created by ns on 1/31/2016.
 */
public abstract class CollectionGenerics <T> implements  Comparable<CollectionGenerics <T>>{
    T[] items;
    int index;

    //You would need to also
    //include a constructor here

    public void add(T item){
        items[index]=item;
        index++;
    }

    public T get(int i){
        return items[i];
    }




}