package Assignment_8;

import java.util.ArrayList;
import java.util.List;

public class Fourth6 {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        l.add("Dhruv");
        l.add("Mehar");
        l.add("Jeet");

        UpperConCat c = lst -> {

            StringBuilder s= new StringBuilder();

            for (String string : lst) {
                s.append(string).append(",");
            }

            s.deleteCharAt(s.length()-1);
            s = new StringBuilder(s.toString().toUpperCase());
            return s.toString();
        };

        System.out.println(c.getInputStrings(l));
    }
}

interface UpperConCat{
    public String getInputStrings(List<String> lst);
}
