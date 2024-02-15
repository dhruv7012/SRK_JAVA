package LeetCode;

import java.util.Arrays;

public class SinorCitizenCount {


    public static void main(String[] args) {

//        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};

        int[] arr = new int[50];
        int lastIndex = arr.length;

        Arrays.fill(arr,0);

        arr[0] = 20;
        arr[1] = 200;
        arr[2] = 210;

        for (int i = 0 ; i < arr.length ; i ++){
            if(arr[i]==0){
                arr[i] = 500;
                System.out.println("Found at " + i);
                break;
            }
        }


    }


}
