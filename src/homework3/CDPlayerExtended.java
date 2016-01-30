package homework3;

/**
 * Created by ns on 1/29/2016.
 */
public class CDPlayerExtended extends CDPlayer {

    public void next() {  }
    public void play() {  }
    public void stop() {  }
    public void prev() {  }

    public void foo(Iterator it) {

    }

    public Iterator retIterator( CDPlayer cdPlayer) {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
}
