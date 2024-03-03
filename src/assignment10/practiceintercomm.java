package assignment10;
class Q{
    int num;
    boolean valueSet=false;
    public synchronized void put(int num){
        while (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("put: "+num);
        this.num=num;
        valueSet=true;
        notify();
    }
    public synchronized  void get(){
        while (!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);}
        }
        System.out.println("get: "+num);
        valueSet=false;
        notify();
    }

}
class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i!=20) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }

}
class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
    public class practiceintercomm {
        public static void main(String[] args) {
            Q q=new Q();
            new Producer(q);
            new Consumer(q);
        }
    }



