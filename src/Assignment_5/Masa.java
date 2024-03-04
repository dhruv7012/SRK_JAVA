package Assignment_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Masa {
    public static void main(String[] args) {
        Map<String, List<String>> hh = new HashMap<>();

        List<String> l = new ArrayList<>();

        l.add("Dhruv");
        l.add("hruvD");
        l.add("hruDv");
        l.add("hDvru");

        hh.put("Dhruv",l);
        hh.put("Fhruv",l);


        System.out.println(hh);



        List<List<String>> nn = new ArrayList<>(hh.values());


        System.out.println(nn);

    }
}
