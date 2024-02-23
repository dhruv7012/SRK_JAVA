//package Assignment_8;
//
//public class Fourth1
//{
//    public static void main(String[] args)
//    {
//        WordCounter w = sentence -> sentence.split("\\s+").length;
//        System.out.println("Number of Words : "+w.countWords("Dhruv is good people"));
//    }
//}
//interface WordCounter
//{
//    int countWords(String sentence);
//}


package Assignment_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fourth1 {
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
            for (String s : lst) {
                if (s.isEmpty()) {
                    count++;
                }
            }

            return count;
        };

        System.out.println(c.countStrings(l));




//        System.out.println("There are total " + count + " Strings");
    }


}

interface CountWords1 {

    public int countStrings(List<String> lst);

}
