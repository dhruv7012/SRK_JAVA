package Assignment_7;

public class ThreadUsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Stopped Running !!");
    }

    public static void main(String[] args) {
        ThreadUsingRunnable tc = new ThreadUsingRunnable();

        Thread t =new Thread(tc);

        t.start();
    }
}


