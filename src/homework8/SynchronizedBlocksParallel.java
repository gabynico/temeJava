package homework8;

public class SynchronizedBlocksParallel {

    private Integer a;
    private Integer b;

    public SynchronizedBlocksParallel(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public void addA() {
        synchronized( a ) {
            a++;
            System.out.println("a =" + a);
        }
    }


    public void addB() {
        synchronized( b ) {
            b++;
            System.out.println("b =" + b);
        }
    }


}


