package EXPrac;


class Counts {

    int c;

    public synchronized void increment() {
        c = c + 1;
    }
}

public class ThredSync {
    public static void main(String[] args) throws InterruptedException {
        Counts c1 = new Counts();


//        for (int i = 0; i < 1000; i++) {
//            c1.increment();
//        }


/*  Instead of creating thread class and creating object for that thread class
*   I preferd creating object of Thread and using runnable functional interface
*   With the help of lamda function */


        Thread t1 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        c1.increment();
                    }
                }
        );

        Thread t2 = new Thread(
                () -> {
                    for (int i = 0; i < 1000; i++) {
                        c1.increment();
                    }
                }
        );

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c1.c);
    }
}
