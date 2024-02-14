package Assignment_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//     QUE 4.1
        System.out.println(Pattern.matches("[a-zA-Z0-9]{0,6}","adwi12"));

//     QUE 4.2
        System.out.println(Pattern.matches("[789][0-9]{9}","9012990999"));

//     QUE 4.3
        System.out.println(Pattern.matches("^(?!.*([a-zA-Z]).*\\1)$","ababsdbjkmabjdwbkj"));

//     QUE 4.4
        String s = "HUM HAI DHRUV";

        Pattern pt = Pattern.compile("\\b[a-zA-Z]");
        Matcher mt = pt.matcher(s);

        while (mt.find())
            System.out.print(mt.group());

        System.out.println();

//     QUE 4.5
        String s1 = "Dhruv";
        String s2 = "Parekh";

        System.out.println("Before Swap : S1 = " + s1 + " and S2 = " + s2 );

        s1 = s1 + ", " + s2;

        Pattern r = Pattern.compile("^(.*?),\\s*(.*?)$");
        Matcher m = r.matcher(s1);

        if(m.find()){
            s1= m.group(2);
            s2= m.group(1);
        }

        System.out.println("After Swap : S1 = " + s1 + " and S2 = " + s2 );


    }
}