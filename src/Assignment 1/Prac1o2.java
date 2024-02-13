public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,40,3,2,31,40};
        int first = arr[0];
        int runnerup = arr[1];

        for (int i = 0 ; i< arr.length; i++){

            if(first < arr[i]){
                first = arr[i];
            }
            else if (runnerup < arr[i] && first != arr[i]){
                runnerup = arr[i];
            }
        }

        System.out.println(first);
        System.out.println(runnerup);

    }
}