package EXPrac;

public class ThreJoin {
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(

                () -> {
                    for (int i = 0 ; i < 5 ; i++){
                        System.out.println(i);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        Thread t2 = new Thread(
                () -> {
                    for (int i = 10 ; i< 15; i++){
                        System.out.println(i);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );

        t1.start();
        System.out.println(t1.isAlive());
        t1.join();

        t2.start();
        t2.join();


        System.out.println("Main");


    }
}
