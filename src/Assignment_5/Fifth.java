package Assignment_5;

import java.util.Objects;
import java.util.Scanner;

public class Fifth {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, k;
        String ip;
        boolean run = true;
        while (true) {
            System.out.print("Enter a digit you want to display: ");
            ip = sc.next();
            if (Objects.equals(ip, "exit")) {
                System.out.println("Stop Executing ...");
                run = false;
                break;
            }
            n = Integer.parseInt(ip);
//            n = sc.nextInt();
//switch to the corresponding digit case
            switch (n) {
                case 0:
                    System.out.println(" _ \n| | \n|_|");
                    break;
                case 1:
                    System.out.println("   \n  |\n  |");
                    break;
                case 2:
                    System.out.println(" _ \n _|\n|_ ");
                    break;
                case 3:
                    System.out.println(" _ \n _|\n _|");
                    break;
                case 4:
                    System.out.println("   \n|_|\n  |");
                    break;
                case 5:
                    System.out.println(" _ \n|_ \n _|");
                    break;
                case 6:
                    System.out.println(" _ \n|_ \n|_|");
                    break;
                case 7:
                    System.out.println(" _ \n  |\n  |");
                    break;
                case 8:
                    System.out.println(" _ \n|_|\n|_|");
                    break;
                case 9:
                    System.out.println(" _ \n|_|\n _|");
                    break;

                default:
                    System.out.println("Try giving single digit integer.");
            }
        }
    }
}  