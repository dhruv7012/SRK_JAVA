package Assignment_7;

public class TryingThreadPool extends Thread {

    String name;

    TryingThreadPool(String s) {
        this.name = s;
    }

    public static void main(String[] args) {
        TryingThreadPool t1 = new TryingThreadPool("Thread 1");
        TryingThreadPool t2 = new TryingThreadPool("Thread 2");

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Endline line of Main method");
    }

    public void run() {
        System.out.println("Thread Started " + Thread.currentThread().getName());
    }
}
