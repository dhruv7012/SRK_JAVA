public class Marix {
    public static void main(String[] args) {

        int[][] twod = new int[10][10];
        int sum=0;

        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0 ; j < 10 ; j++){
                if (i == j){
                    twod[i][j] = i;
                }
            }
        }
        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0 ; j < 10 ; j++){

                    System.out.print(twod[i][j] + " ");

            }
            System.out.println(" ");
        }

        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0 ; j < 10; j++){
                if (i == j){
                    sum = sum + twod[i][j];
                }
            }
        }


        System.out.println("Sum of the diagonals of 2d matrix is : " + sum);
    }
}
