public class Prac3o3 {
    public static void main(String[] args) {
        int[] arr = {10,10,20,10,10,30,50,10,20,20};
        int co = 0;

        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0 ; i < arr.length ; i ++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] != -1 && arr[j] != -1) {

                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i] + " at " + i);
                        System.out.println(arr[j]+ " at " + j);
                        System.out.println("Count = " + co);
                        System.out.println("==========");

                        co++;
                        arr[i] = arr[j] = -1;
                    }
                }
            }
        }

        System.out.println("Total Count is " + co);
    }
}
