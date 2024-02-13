package Assignment_2;
public class pattern2 {

    public static void main(String[] args) {

        char input = 'G';
        patternPrint(input-66);
    }

    public static void patternPrint(int row){

        char c = 'A';

        for(int i = 0; i <= row ; i++) {
            System.out.print(" ");
        }
        System.out.println(Character.toString(c));

        for(int i = 0; i < row ; i++){

            for (int k = 0 ; k < row-i ; k++){
                System.out.print(" ");
            }

            System.out.print(Character.toString(c+i+1)+" ");
            for (int x = 0 ; x<i; x++){
                System.out.print("  ");
            }
            System.out.print(Character.toString(c+i+1));
            System.out.println(" ");
        }
        for(int i = row; i >= 0 ; i--){

            for (int k = 0 ; k < row-i ; k++){
                System.out.print(" ");
            }

            System.out.print(Character.toString(c+i+1)+" ");
            for (int x = 0 ; x<i; x++){
                System.out.print("  ");
            }
            System.out.print(Character.toString(c+i+1));
            System.out.println(" ");
        }

        for(int i = 0; i <= row ; i++) {
            System.out.print(" ");
        }
        System.out.println(Character.toString(c));
    }

}
