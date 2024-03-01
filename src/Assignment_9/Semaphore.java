package Assignment_9;


import java.io.IOException;
import java.util.*;

public class Semaphore {


    public static void main(String[] args) throws IOException {

        String key = "";
        String gdhruv;
        String value = "";
        Map<String, String> l = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        l.put("London", "Paris");
        l.put("Strawberry", "Chery");
        l.put("Singapore", "Hong Cong");
        l.put("Captain America", "Iron Man");
        l.put("BubbleGum", "Lollipop");
        l.put("Accelerator", "Elevator");
        l.put("Ice cream", "Yogurt");


//        System.out.println(l);


        System.out.print("Enter the total number of players : ");

        int n = sc.nextInt();


        if (n >= 3) {

            int flag = (int) (Math.random() * 2); // 0 or 1
            int flag2 = (int) (Math.random() * l.size());

            System.out.print("How many Undercover required ?  : ");
            int totalUd = sc.nextInt();

            List<Integer> arrList = new ArrayList<>();
            int generateN;

//            for (int i = 0 ; i < totalUd; i++){
            while (arrList.size() != totalUd){
                generateN = (int) (Math.random() * n);
                if (!arrList.contains(generateN)){
                    arrList.add(generateN);
                }
            }


            for (int i = 0; i<arrList.size() ; i++){

                System.out.println("array");
                System.out.println(arrList.get(i));
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

                for (int j = 0; j < arrList.size(); j++) {

                    if (i == arrList.get(j) && i != mrWhite) {
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
            boolean found;


            for (int i = 0 ; i < arrList.size(); i++) {

                System.out.println(arrList.get(i)+1);
            }

            do {

                System.out.print("Guess the under cover : ");

                found = false;

                u = sc.nextInt()-1;

                for (int j = 0; j < arrList.size(); j++) {

//                    System.out.println(u + " : " + arrList.get(j));

                    if (u == arrList.get(j)) {
                        System.out.println("Yesssss " + list.get(u) + " is Undercover");
                        foundedUd++;
                        found = true;
                        break;
                    }
                }

                if (!found){
                    System.out.println("booooooooooooooooo");
                }

            }while (totalUd != foundedUd);
        } else {
            System.out.println("Minimum number of player is 3");
        }
    }

}

