package homework3;

/**
 * Created by ns on 1/29/2016.
 */
public class CDPlayerExtended extends CDPlayer {

    public void foo(Iterator it) {
        while(it.hasNext()){
            System.out.println("The next track is: " + it.next());
        }
    }

    public static Iterator retIterator(CDPlayer cdPlayer) {

        return new Iterator() {
            private int cnt = 4;
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                if (currentIndex < cnt ) {
                    return true;
                }else{
                    return false;
                }
            }

            @Override
            public Object next() {
                return currentIndex++;
            }
        };
    }

    public static void main(String[] args) {

        CDPlayerExtended c = new CDPlayerExtended();
        CDPlayer cdPlayer = new CDPlayer();
        c.foo(retIterator(cdPlayer));
    }

}
