package Assignment_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Firsto2 {
    public static void main(String[] args) {
        Integer[] arr = {21,123,4,21,123,4,1,222};
        List<Integer> a= Arrays.asList(arr);
        List<Integer> na= a.stream().sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println(na);
        System.out.println("Winner "+na.get(0));
        System.out.println("Runner up "+na.get(1));
    }
}
