package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rawaosd {

    public static void main(String[] args) {
        int[] as = {100, 4, 101, 102, 90, 103, 104, 1, 3, 2, 1};
        int[] as1 = {0, -1, -2};

        int x = longestConsecutive(as);
        System.out.println(x);

    }

    public static int longestConsecutive(int[] as) {
        if (as.length < 1) return 0;
        Arrays.sort(as);
        HashMap<Integer, Integer> h = new HashMap<>();
//        List<Integer> a = new ArrayList<>();
//        for(int i: as) a.add(i);
        int max = as[0];
        int count = 1;
        int cm = 0;
        int value = 0;

        for (int i = 0; i < as.length; i++) {
            h.put(as[i], 1);
        }

        for (Map.Entry<Integer, Integer> e : h.entrySet()) {

//            System.out.print("Key " + e.getKey());
//            System.out.println(",  value " + e.getValue());

            if (h.containsKey(max + 1)) {
                max = e.getKey();
                h.put(max, count);
                count++;
            } else {
                System.out.println("Else Called");
                count = 1;
                max = e.getKey();
                h.put(max, 1);
            }
//
//            if (h.containsKey(max+1)) {
//
//                System.out.println("if " + h.get(max));
//
//                count = h.get(max) + 1;
//                max++;
//                h.put(max, count);
//
//            } else if (h.containsValue(max-1)) {
//                System.out.println("elif " + h.get(max));
//                count = h.get(max) + 1;
//                max--;
//                h.put(max, count);
//            }else{
//                count = 1;
//                h.put(max, count);
//            }
        }


        for (Map.Entry<Integer, Integer> e : h.entrySet()) {


            if (e.getValue() < 0) {
                if (h.containsKey(max - 1)) {
                    max = e.getKey();
                    h.put(max, count);
                    count++;
                } else {
                    System.out.println("Else Called");
                    count = 1;
                    max = e.getKey();
                    h.put(max, 1);
                }
            }
        }
        for (Integer i : h.keySet()) {

            if (h.get(i) > cm) {
                cm = h.get(i);
                value = i;
            }

        }

        System.out.println(h);

        return cm;
    }
}

