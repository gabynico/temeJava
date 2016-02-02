package homework6;

import java.util.Collection;

/**
 * Created by ns on 1/30/2016.
 */
public abstract class ClassSink  implements Sink{


    public static <T> T writeAll(Collection<T> coll, Sink<? super T> snk){
        T last = null;
        for (T t : coll) {
            last = t;
            snk.flush(last);
        }
        return last;
    }

    public static void main(String[] args) {
        Sink<Object> s;
        Collection<String> cs;

        //String str= writeAll(cs, s);

    }
}
