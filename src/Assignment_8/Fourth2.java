package Assignment_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fourth2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Dhruv");
        l.add("Mehar");
        l.add("jeetShree");
        l.add("SolOngstringdoenstmeanuanyrhing");
        l.add("");
        l.add("");


        CountWords c = lst -> {
            int count = 0 ;
            for (String s : l) {
                if (s.length() > 3) {
                    count++;
                }
            }

            return count;
        };

        System.out.println(c.countStrings(l));




//        System.out.println("There are total " + count + " Strings");
    }


}

interface CountWords {

    public int countStrings(List<String> lst);

}
