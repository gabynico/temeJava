package homework8;

public class SynchronizedBlocksParallelB extends Thread{
    private SynchronizedBlocksParallel obj;

    public SynchronizedBlocksParallelB(SynchronizedBlocksParallel obj) {
        this.obj = obj;
    }

    public void run() {
        for(int i = 1; i <= 20; i++){
            this.obj.addB();
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
