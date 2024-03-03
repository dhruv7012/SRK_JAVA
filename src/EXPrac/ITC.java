package EXPrac;


class Prod implements Runnable {
    Q q;

    public Prod(Q q) {
        this.q = q;
        Thread t1 = new Thread(this, "Producer");
        t1.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.setNum(i++);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Cons implements Runnable {
    Q q;

    public Cons(Q q) {
        this.q = q;
        Thread t2 = new Thread(this, "Consumer");
        t2.start();
    }

    @Override
    public void run() {

        while (true) {
            q.getNum();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ITC {
    public static void main(String[] args) throws InterruptedException {
        Q q = new Q();

        new Prod(q);
        new Cons(q);
    }
}

class Q {
    int num;
    boolean working=false;

    public synchronized void getNum() {

        while (!working){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Get : " + num);
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
        System.out.println("Set : " + num);
        working = true;
        notify();
    }
}