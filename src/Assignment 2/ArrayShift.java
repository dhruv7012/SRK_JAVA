public class ArrayShift {
    public static void main(String[] args) {

        int[] arr = {12,23,34,45,56,67};
        int d = 3;
        int temp;

        System.out.println("Before shift :");
        for (int i = 0 ; i < arr.length ; i ++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0 ; i < d ; i ++){
            shift(arr);
        }

        System.out.println("\n");
        System.out.println("After shift :");

        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void shift(int[] arrr){

        int temp=arrr[0];

        for(int i = 0 ; i < arrr.length-1 ; i ++){
            arrr[i] = arrr[i+1];
        }

        arrr[arrr.length-1] = temp;

    }

}
