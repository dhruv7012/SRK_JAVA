package Assignment_8;

import java.util.ArrayList;
import java.util.List;

interface ManupulateList {

    public double returnNumber(List<Integer> lst);

}

public class Fourth8 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(12);
        l.add(13);
        l.add(34);
        l.add(18);
        l.add(13);
        l.add(18);
        l.add(10);
        l.add(12);
        l.add(16);

        System.out.println(l);

        ManupulateList c1 = lst -> {
            double x = lst.get(0);

            for (int i = 1; i < lst.size(); i++) {
                x += lst.get(i);
            }

            x = x / lst.size();

            return x;
        };

        System.out.println("Average of list : " + c1.returnNumber(l));


        ManupulateList c2 = lst -> {
            double x = lst.get(0);

            for (int i = 1; i < lst.size(); i++) {

                if (x < lst.get(i)) {
                    x = lst.get(i);
                }
            }

            return x;
        };

        System.out.println("Max of list : " + c2.returnNumber(l));


        ManupulateList c3 = lst -> {
            double x = lst.get(0);
            for (int i = 1; i < lst.size(); i++) {


                if (x > lst.get(i)) {
                    x = lst.get(i);
                }
            }

            return x;
        };

        System.out.println("Min of list : " + c3.returnNumber(l));


        ManupulateList c4 = lst -> {
            double x = lst.get(0);

            for (int i = 1; i < lst.size(); i++) {
                x += lst.get(i);
            }

            return x;
        };


        System.out.println("Sum of list : " + c4.returnNumber(l));
    }
}
