package CollectionExamples;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<Integer>();

        i.add(12);
        i.add(31);
        i.add(12);
        i.add(14);
        i.add(12);

        System.out.println(i);


        System.out.println(i.stream().distinct().toList());
    }
}
