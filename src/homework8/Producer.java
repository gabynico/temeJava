package homework8;

import java.util.Random;

public class Producer extends Thread{

    private Buffer buffer;
    private int cnt;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        Random rand = new Random();

        while(cnt<100) {
            // Generate a random integer and store it in the buffer
            int n = rand.nextInt();
            buffer.produce(n);
            this.cnt++;
        }
    }
}
