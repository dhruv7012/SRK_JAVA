package Assignment_6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Firsto3 {
    public static void main(String[] args) {
        Integer[] arr = {12,23,123,213,3,12,12,43,12};
        List<Integer> arrList= Arrays.asList(arr);
        System.out.println(arrList);
        Map<Integer, Long> map = arrList
                .stream()
                .distinct()
                .collect(Collectors.toMap(entry -> entry, entry -> arrList.stream().filter(entry::equals).count()));
        System.out.println(map);
    }
}