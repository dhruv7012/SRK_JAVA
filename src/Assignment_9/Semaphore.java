package Assignment_9;


import java.io.IOException;
import java.util.*;

public class Semaphore {


    public static void main(String[] args) throws IOException {

        String key = "";
        String value = "";
        Map<String, String> l = new HashMap<>();

        l.put("London", "Paris");
        l.put("Sarawbery", "Chery");
        l.put("Singapor", "Hongkong");
        l.put("Captain America", "Iron Man");
        l.put("BubbleGum", "Lolipop");
        l.put("Accesecltor", "Elevator");
        l.put("Ice cream", "Yogurt");


        System.out.println(l);


        int n = 3;


        int flag =(int) (Math.random() * 2);
        int flag2 = (int) (Math.random() * l.size());
        int count = 0;

        for (Map.Entry<String, String> mapElement : l.entrySet()) {

            if (flag2 == count) {

                if (flag == 0) {
                    key = mapElement.getKey();
                    value = (mapElement.getValue());
                } else {
                    value = mapElement.getKey();
                    key = (mapElement.getValue());
                }


                break;
            }
            count++;
        }

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int random2 = (int) (Math.random() * n);


//        System.out.println(key + ":"+ value);
        for (int i = 0; i < n; i++) {


            System.out.println("Next Players Turn");

            list.add(sc.next());

            for (int j = 0; j < 50; j++) {
                System.out.println("\n");
            }


            if (i == random2) {
                System.out.println(key);
            } else {
                System.out.println(value);
            }

            System.out.println("Write anything to clear");

            sc.next();

            for (int j = 0; j < 50; j++) {
                System.out.println("\n");
            }

        }

        int u;

        for (int i = 0; i < n; i++) {

            System.out.println("Write Number of player");

            u = sc.nextInt() - 1;

            if (u == random2) {
                System.out.println("Yesssss " + list.get(u) + " is Undercover");
                break;
            } else {
                System.out.println("boooooooooooo.");
            }
        }

    }

}

