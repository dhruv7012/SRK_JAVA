import java.util.HashMap;
import java.util.Map;

public class Method32o3 {
    public static void main(String[] args) {
        int[] arr = {10,10,20,10,10,30,50,10,20,20};
        int co = 0;

        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        HashMap<Integer, Integer> ham = new HashMap<>();

        for (int i = 0 ; i < arr.length ; i++){

            if (ham.containsKey(arr[i])){
                ham.put(arr[i],ham.get(arr[i])+1) ;
            }
            else{
                ham.put(arr[i],1);
            }

        }

        for (Map.Entry<Integer,Integer> itr: ham.entrySet()){
            if (itr.getValue() != 1){
                co = co + itr.getValue() /2 ;
            }

        }

        System.out.print("Total Pairs : ");
        System.out.println(co);
    }
}
