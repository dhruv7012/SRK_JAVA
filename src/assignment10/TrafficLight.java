package assignment10;


    import java.util.concurrent.Semaphore;

    public class TrafficLight {
        // Semaphore to control access to the intersection
        private final Semaphore semaphore = new Semaphore(1);

        // Method to simulate a car crossing the intersection
        public void crossIntersection(String carName) {
            try {
                System.out.println(carName + " is waiting at the intersection.");
                semaphore.acquire(); // Car waits until it can enter the intersection
                System.out.println(carName + " is crossing the intersection.");
                Thread.sleep(2000); // Simulating time taken to cross the intersection
                System.out.println(carName + " has crossed the intersection.");
            } catch (InterruptedException e) {
              //  e.printStackTrace();
            } finally {
                semaphore.release(); // Release the semaphore after crossing
            }
        }

        public static void main(String[] args) {
            TrafficLight trafficLight = new TrafficLight();

            // Simulating cars approaching the intersection
            Thread car1 = new Thread(() -> trafficLight.crossIntersection("Car 1"));
            Thread car2 = new Thread(() -> trafficLight.crossIntersection("Car 2"));
            Thread car3 = new Thread(() -> trafficLight.crossIntersection("Car 3"));

            car1.start();
            car2.start();
            car3.start();
        }
    }

