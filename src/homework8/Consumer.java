package homework8;

public class Consumer extends Thread {
    private Buffer buffer;
    private int cnt;
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int data;

        while(cnt<100) {
        // Consume the data from the buffer. We are not using the consumed
        // data for any other puporse here
            data = buffer.consume();
            this.cnt++;
        }
    }
}