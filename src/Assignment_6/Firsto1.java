package Assignment_6;

import java.util.List;

public class Firsto1 {
    public static void main(String[] args) {
        List<Integer> a= List.of(12,32,44,23,12,12,12);
        List<Integer> dl=a.stream().distinct().toList();
        System.out.println(dl);
    }
}
