package homework3;

/**
 * Created by ns on 1/30/2016.
 */
public class Map {

    private String[] directions = {"North", "East", "South", "West"};

    public void foo(Iterator it) {
        while(it.hasNext()){
            System.out.println("The next direction is: " + directions[(Integer)it.next()]);
        }
    }

    public static void main(String[] args) {

        Map m = new Map();
        m.foo(new Iterator()  {
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
        });
    }
}
