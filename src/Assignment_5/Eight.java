package Assignment_5;

import java.util.regex.Pattern;

public class Eight {
    public static void main(String[] args) {
        String str1 = "Dhruv08";
        String str2 = "Dhruv0127";

        validUsername(str1);
        validUsername(str2);

    }

    static void validUsername(String str) {
        if (Pattern.matches("[a-zA-Z][a-zA-Z0-9|_]{8,30}", str))
            System.out.println(str + " is Valid Username");
        else System.out.println(str + " is Invalid Username");
    }
}
