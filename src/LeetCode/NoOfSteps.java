package LeetCode;

public class NoOfSteps {
    public static void main(String[] args) {
        int num = 14;
        int steps = 0;

        while (num != 0){

            if (num%2 == 0){
                num = num /2;
            }else {
                num--;
            }
            steps++;
        }

        System.out.println(steps);
    }
}
