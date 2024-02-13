import java.util.Scanner;

public class BMIcal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hight (inch) : ");
        float height = sc.nextFloat();
        System.out.print("Enter Weight (pound) : ");
        float weight = sc.nextFloat();

        float BMI= 703 * weight/(height*height);

        System.out.println(BMI);
        
        if (BMI > 40.00){
            System.out.println("3rd degree obesity");
        } else if (BMI > 35.00 ) {
            System.out.println("2nd degree obesity");
        } else if (BMI > 30.00) {
            System.out.println("1st degree obesity");
        } else if (BMI > 27.50 ) {
            System.out.println("overweight high range");
        } else if (BMI > 25.00) {
            System.out.println("overweight low range");
        } else if (BMI > 23.00 ) {
            System.out.println("normal high range");
        } else if (BMI > 18.50) {
            System.out.println("normal, low range");
        } else if (BMI > 17.00 ) {
            System.out.println("underweight");
        } else if (BMI > 16.00) {
            System.out.println("emaciation");
        } else {
            System.out.println("starvation");
        }


    }
}
