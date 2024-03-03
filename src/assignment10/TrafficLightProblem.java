package assignment10;


import java.util.concurrent.TimeUnit;

public class TrafficLightProblem {
    private static final Object lock = new Object();
    private static boolean isGreen = false;

    static class Car extends Thread {
        private final String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while (!isGreen) {
                        System.out.println(name + " is waiting at the traffic light.");
                        lock.wait();
                    }
                    System.out.println(name + " is crossing the intersection.");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(name + " has crossed the intersection.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class TrafficLightController extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    TimeUnit.SECONDS.sleep(5); // Simulate green light duration
                    synchronized (lock) {
                        System.out.println("Traffic light is green.");
                        isGreen = true;
                        lock.notifyAll(); // Notify waiting cars
                    }
                    TimeUnit.SECONDS.sleep(5); // Simulate red light duration
                    synchronized (lock) {
                        System.out.println("Traffic light is red.");
                        isGreen = false;
                    }
                }
            } catch (InterruptedException e) {
             //   e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread trafficLightController = new TrafficLightController();
        trafficLightController.start();

        // Simulating cars approaching the intersection
        Thread car1 = new Car("Car 1");
        Thread car2 = new Car("Car 2");
        Thread car3 = new Car("Car 3");

        car1.start();
        car2.start();
        car3.start();
        car1.join();
        car2.join();
        car3.join();
    }
}
