package Assignment_9;


import java.io.IOException;
import java.util.*;

public class Semaphore {


    public static void main(String[] args) throws IOException {

        String key = "";
        String value = "";
        Map<String, String> l = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        l.put("London", "Paris");
        l.put("Sarawbery", "Chery");
        l.put("Singapor", "Hongkong");
        l.put("Captain America", "Iron Man");
        l.put("BubbleGum", "Lolipop");
        l.put("Accesecltor", "Elevator");
        l.put("Ice cream", "Yogurt");


//        System.out.println(l);


        System.out.print("Enter the total number of players : ");

        int n = sc.nextInt();


        if (n >= 3) {


            int flag = (int) (Math.random() * 2); // 0 or 1
            int flag2 = (int) (Math.random() * l.size());

            System.out.print("How many Undercover required ?  : ");
            int totalUd = sc.nextInt();

            int[] arr = new int[totalUd];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * n);
            }

            for (int i = 0; i<arr.length ; i++){

                System.out.println("array");
                System.out.println(arr[i]);
            }

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

            List<String> list = new ArrayList<>();

//            int random2 = (int) (Math.random() * n); // 0 to 4
            int mrWhite = (int) (Math.random() * n); // 0 to 4


//        System.out.println(key + ":"+ value);
            for (int i = 0; i < n; i++) {


                System.out.println("Players " + (i + 1) + "'s Turn");
                System.out.print("Enter the name : ");
                list.add(sc.next());

                for (int j = 0; j < 50; j++) {
                    System.out.println("\n");
                }

                for (int j = 0; j < arr.length; j++) {

                    if (i == arr[j] && i != mrWhite) {
                        System.out.println(key);
                        break;
                    } else if (i == mrWhite) {
                        System.out.println("You are Mr. White");
                        break;
                    } else {
                        System.out.println(value);
                        break;
                    }

                }

                System.out.println("Write anything to clear");

                sc.next();

                for (int j = 0; j < 50; j++) {
                    System.out.println("\n");
                }

            }

            int u;
            int foundedUd=0;

            do {

                System.out.print("Guess the under cover : ");

                u = sc.nextInt() - 1;

                for (int j = 0; j < arr.length; j++) {
                    if (u == arr[j]) {
                        System.out.println("Yesssss " + list.get(u) + " is Undercover");
                        foundedUd++;
                        break;
                    } else {
                        System.out.println("boooooooooooo.");
                        break;
                    }
                }
            }while (totalUd != foundedUd);
        } else {
            System.out.println("Minimum number of player is 3");
        }
    }

}

