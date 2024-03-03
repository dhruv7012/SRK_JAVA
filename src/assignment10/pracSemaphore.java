package assignment10;

import java.util.concurrent.Semaphore;

class Shared {
    static int count = 0;
}

class DemoThread extends Thread {
    Semaphore semaphore;
    String ThreadName;

    public DemoThread(Semaphore semaphore, String ThreadName) {
        this.semaphore = semaphore;
        this.ThreadName = ThreadName;
    }

    @Override
    public void run() {
        if (this.getName().equals("A")) {
            System.out.println("Starting Thread" + ThreadName);
            try {
                System.out.println(ThreadName + "is waiting for permit");
                semaphore.acquire();
                System.out.println(ThreadName + " gets a permit");
                for (int i = 0; i < 5; i++) {
                    Shared.count--;
                    System.out.println(ThreadName + ": " + Shared.count);
                    Thread.sleep(1000);

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread " + ThreadName + " releases the permit.");
            semaphore.release();
        } else {
            System.out.println("Starting thread " + ThreadName);
            try {
                System.out.println("Thread " + ThreadName + " is waiting for a permit.");
                semaphore.acquire();
                System.out.println("Thread " + ThreadName + " gets a permit.");

                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(ThreadName + ": " + Shared.count);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignored) {
            }
            System.out.println("Thread " + ThreadName + " releases the permit.");
            semaphore.release();
        }
    }
}

public class pracSemaphore {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        DemoThread dt1 = new DemoThread(semaphore, "A");
        DemoThread dt2 = new DemoThread(semaphore, "B");
        dt1.start();
        dt2.start();
        dt1.join();
        dt2.join();
        System.out.println("count: " + Shared.count);
    }
}
