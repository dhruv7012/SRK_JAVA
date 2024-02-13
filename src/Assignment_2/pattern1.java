package Assignment_2;
public class pattern1 {


    public static void main(String[] args) {
        patternPrint(4);
    }

    public static void patternPrint(int row){
        for(int i = 0; i <= row ; i++){

            for (int k = 0 ; k < row-i ; k++){
                System.out.print(" ");
            }

            for(int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i = row; i >= 0 ; i--){

            for (int k = 0 ; k < row-i ; k++){
                System.out.print(" ");
            }

            for(int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
