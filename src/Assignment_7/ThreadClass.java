package Assignment_7;

public class ThreadClass extends Thread{

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
        ThreadClass t = new ThreadClass();

        t.start();
    }

}
