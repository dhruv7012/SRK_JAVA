import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int totalOpreation;
        int typeip;
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of opreations : ");
        totalOpreation = sc.nextInt();

        for (int i = 0 ; i < totalOpreation ; i ++){

            System.out.print("Enter the choice : ");
            typeip = sc.nextInt();
            System.out.print("Enter the number : ");
            number = sc.nextInt();

            switch (typeip){
                case 1:
                    if(isOdd(number)){
                        System.out.println("Number is Odd");
                    }
                    else {
                        System.out.println("Number is Even");
                    }
                    break;

                case 2:
                    if (isPrime(number)){
                        System.out.println("Number is prime");
                    }
                    else {
                        System.out.println("Number is Composite");
                    }
                    break;

                case 3:
                    if (isPalindrome(number)){
                        System.out.println("Number is Palindrome");
                    }
                    else {
                        System.out.println("Number is not Palindrome");
                    }
                    break;

                default:
                    System.out.println("Enter the Choice in 1 ,2 or 3 only!!");
            }
        }
    }

    public static boolean isOdd(int numb){

        if (numb % 2 == 0){
            return false;
        }
        return true;
    }

    public static boolean isPrime(int numb){

        for (int i = 2 ; i < 19 ; i++){
            if (numb % i == 0 && numb != i){
                return true;
            }
        }

        return false;
    }

    public static boolean isPalindrome(int numb){

        int remainder;
        int sum = 0;
        int temp = numb;
        while(numb > 0){
            remainder = numb%10;
            sum = (sum*10) + remainder;
            numb = numb/10;
        }

        if(temp == sum) {
            return true;
        }

        return false;
    }

}