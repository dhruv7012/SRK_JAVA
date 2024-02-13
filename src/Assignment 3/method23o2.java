import java.util.Scanner;

public class method23o2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.next();
        System.out.print("Enter the Length : ");
        long n = sc.nextLong();
        int length = str.length();
        long co = 0;
        int charInOneSubstring = 0 ;
        int charInFinalSubstring = 0 ;

        for (int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'a'){
                charInOneSubstring++;
            }
        }

        str = str.substring(0, (int) (n%str.length()));

        for (int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'a'){
                charInFinalSubstring++;
            }
        }
//        System.out.println(charInFinalSubstring);

        System.out.println("Frequency of character a is : ");

        co = ((n/length * charInOneSubstring) + charInFinalSubstring);

        System.out.println(co);
    }
}
