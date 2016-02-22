package homework8;

public class SynchronizedBlocksParallelA extends Thread{
    private SynchronizedBlocksParallel obj;

    public SynchronizedBlocksParallelA(SynchronizedBlocksParallel obj) {
        this.obj = obj;
    }

    public void run() {
        for(int i = 1; i <= 20; i++){
            this.obj.addA();
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
