package EXPrac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateThread extends Thread{

   String name;

    public CreateThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name + "Thread Strated");

        for (int i = 0 ; i < 3 ; i ++){
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(name + "Thread End");
    }

    public static void main(String[] args) throws InterruptedException {

//        ExecutorService ex = Executors.newFixedThreadPool(1);
//
//        CreateThread t1 = new CreateThread("Dhruv");
//        CreateThread t2 = new CreateThread("DD");
//
//        ex.execute(t1);
//        ex.execute(t2);
//
//        ex.shutdown();
//
//        while (!ex.isTerminated()){
//
//        }
//
//        System.out.println("main");


        CreateThread t1 = new CreateThread("Dhruv");
        CreateThread t2 = new CreateThread("DD");

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        System.out.println("main");



    }
}
