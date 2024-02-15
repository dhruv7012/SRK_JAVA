package Assignment_5;

import java.util.Scanner;

public class ThirdPrac {

    public static void main(String[] args) throws NegativeSizeException {

        Scanner sc = new Scanner(System.in);
        int value;

        System.out.println("How many elements do you want to add ? :");
        int len = sc.nextInt();

        int[] array = new int[len];

        int i = 0;
        while (i < len) {
            System.out.print("Enter the value : ");
            value = sc.nextInt();
            try {
                if (value < 0) {
                    throw new NegativeSizeException();
                } else {
                    array[i] = value;
                    System.out.println("Positive Value Stored at index " + i);
                    i++;
                }
            } catch (Exception e) {
                System.out.println("Negative Value '" + value + "' found at index : " + i);
            }
        }

        System.out.println("Positive Array :");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

    }

}
