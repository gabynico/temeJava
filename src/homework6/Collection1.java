package homework6;

import java.util.Collection;

interface Collection1<T> {
    boolean  containsAll(Collection<? super T> c, T t);
    boolean addAll(Collection<? super T> c, T t);
}
