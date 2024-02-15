package Assignment_5;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 50 ; i ++){
            if(i%3 == 0){
                System.out.print("Fizz ");
            } else if (i%5==0) {
                System.out.print("FizzBuzz ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
