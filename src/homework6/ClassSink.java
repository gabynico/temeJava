package homework6;

import java.util.Collection;

/**
 * Created by ns on 1/30/2016.
 */
//[ZP] - 0  don't see the demonstration, if the code compiles it doesn't mean the it right
public abstract class ClassSink<T>  implements Sink<T>{

	public static <T> T writeAll(Collection<T> coll, Sink<? super T> snk) {
		T last = null;
		for (T t : coll) {
			last = t;
			snk.flush(last);
		}
		return last;
	}

	public static void main(String[] args) {
		Sink<Object> s = null;
		Collection<String> cs = null;

		String str = writeAll(cs, s);

	}

}
