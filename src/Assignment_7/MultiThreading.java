package Assignment_7;

public class MultiThreading extends Thread {

    public static void main(String[] args) {

        MultiThreading t1 = new MultiThreading();
        MultiThreading t2 = new MultiThreading();
        MultiThreading t3 = new MultiThreading();

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {

        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " Started");
        } catch (Exception ex) {
            System.out.println("Exception has" +
                    " been caught" + ex);
        }
    }
}
