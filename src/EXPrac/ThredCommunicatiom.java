package EXPrac;

class Producer implements Runnable{
    P p;

    public Producer(P p) {
        this.p = p;
        Thread t1 = new Thread(this , "Producer");
        t1.start();
    }

    @Override
    public void run() {
        int i =0;

        while (true){
            i++;
            p.setNum(i);
            try { Thread.sleep(300); } catch (Exception e) {}
        }
    }
}

class Consumer implements Runnable{
    P p;

    public Consumer(P p) {
        this.p = p;
        Thread t2 = new Thread(this, "Consumer");
        t2.start();
    }

    @Override
    public void run() {
        while (true){
            p.getNum();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

class P{
    int num;
    boolean working = false;


    /*Getter Setter*/

    public synchronized void getNum() {

        while (!working){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("GET : " + num);
        working = false;
        notify();

    }

    public synchronized void setNum(int num) {

        while (working){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.num = num;
        System.out.println("SET : " + num);
        working = true;
        notify();
    }
}

public class ThredCommunicatiom {
    public static void main(String[] args) {
        P p = new P();

        new Producer(p);
        new Consumer(p);
    }
}
