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
import java.util.List;

interface CountWordsWithA {
    public int CountA(List<String> lst);
}

public class Fourth3 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Dhruv");
        l.add("AntiMehar");
        l.add("AncljeetShree");
        l.add("AntiSolOngstringdoenstmeanuanyrhing");
        l.add("");
        l.add("");

        CountWordsWithA c = lst -> {

            int count = 0;
            for (String s : lst) {
                if (!s.isEmpty() && (s.charAt(0) == 'a' || s.charAt(0) == 'A')) {
                    count++;
                }
            }
            return count;
        };

        System.out.println(c.CountA(l));

    }

}
