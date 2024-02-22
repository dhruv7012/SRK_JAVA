package Assignment_7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fourth implements Runnable{
    String message;
    Fourth(String message){
        this.message =message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" thread started worker:"+this.message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" thread ended");
    }
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Runnable worker=new Fourth(""+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){}
        System.out.println("Last line of main Method");
    }
}
