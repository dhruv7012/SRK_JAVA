package EXPrac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task extends Thread{

    int id;

    Task(int id){
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread "+id+" is running" + Thread.currentThread().getName());
    }
}
public class ExService {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);

        Task t9 = new Task(9);

        ex.execute(new Task(1));
        ex.execute(new Task(2));
        ex.execute(new Task(3));
        ex.execute(t9);

        ex.shutdown();

        while (!ex.isTerminated()) {
            // infinite loop
        }

        System.out.println("Main");
    }
}
