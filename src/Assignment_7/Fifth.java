package Assignment_7;

public class Fifth{
    public static void main(String[] args) {
       Thread t1 = new Thread(new Runnable(){
           @Override
           public void run() {
               System.out.println("Thread 1 is Executing ...");

           }
       });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2 is Executing ...");
            }
        });

        t1.start();
        t2.start();

        System.out.println("Main method execution ...");
    }
}
