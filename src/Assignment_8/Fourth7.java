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
import java.util.Scanner;

interface ListSqare {

    public List<Integer> generateList(int n);

}

public class Fourth7 {
    public static void main(String[] args) {


        ListSqare c = n -> {
            List<Integer> lst = new ArrayList<>();

            for (int i = 0 ; i < n ; i ++){
                lst.add((int) Math.pow(i,2));
            }

            return lst;
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of list : ");

        System.out.println(c.generateList(sc.nextInt()));


    }


}
