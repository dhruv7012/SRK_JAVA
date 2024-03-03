package EXPrac;
import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);

        semaphore.acquire();
        semaphore.acquire();

        semaphore.release();

        System.out.println(semaphore.availablePermits());
    }
}
