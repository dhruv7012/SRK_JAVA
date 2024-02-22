package Assignment_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface CreateList {

    public List<String> GenerateWords(int n);

}

public class Fourth5 {
    public static void main(String[] args) {

        CreateList c = n -> {

            List<String> l = new ArrayList<>();

            for (int i = 0; i <= n; i++) {
                StringBuilder word = new StringBuilder();

                int randlength = (int) (Math.random() * 10) + 2;
                for (int ii = 0; ii < randlength; ii++) {
                    char rand = (char) ((int) (Math.random() * 26) + 97);
                    if (word.isEmpty()) {
                        word.append((char) (rand - 32));
                    }
                    word.append(rand);
                }
                l.add(String.valueOf(word));
            }
            return l;
        };


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of list : ");

        List<String> lst = c.GenerateWords(sc.nextInt());


        System.out.println(lst);

    }
}
