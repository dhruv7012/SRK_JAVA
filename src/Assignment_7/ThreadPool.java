package Assignment_7;

public class ThreadPool extends Thread{

    String name ;

    ThreadPool(String s){
        this.name = s;
    }

    @Override
    public void run() {
        System.out.println("Thread Started " + Thread.currentThread().getName());
    }
}
