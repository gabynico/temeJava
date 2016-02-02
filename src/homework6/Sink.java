package homework6;

/**
 * Created by ns on 1/30/2016.
 */
public interface Sink<T> {
    void flush(T t);
}
