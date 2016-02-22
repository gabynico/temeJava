package homework8;

public class SynchronizedBlocksParallelTest {

    public static void main(String[] args) {

        SynchronizedBlocksParallel obj = new SynchronizedBlocksParallel(0, 0);
        SynchronizedBlocksParallelA a = new SynchronizedBlocksParallelA(obj);
        SynchronizedBlocksParallelB b = new SynchronizedBlocksParallelB(obj);
        // Start the producer and consumer threads
        a.start();
        b.start();
    }
}
