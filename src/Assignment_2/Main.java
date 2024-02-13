package Assignment_2;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter number to check : ");

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        checkArmstrongnumber(number);

    }

    public static void checkArmstrongnumber(String numberString){

        int sum = 0 ;
        int number = parseInt(numberString);

        for(int i = 0 ; i < numberString.length();i++){
            if(number%10 != 0){
                sum += (int) Math.pow((number%10),numberString.length());
                number /= 10;
            }
        }

        System.out.println("Sum of all digits having power of total length is "+ sum);

        if(parseInt(numberString) == sum){
            System.out.println("So number is Armstrongnumber");
        }else{
            System.out.println("So number is not Armstrongnumber");
        }
    }
}