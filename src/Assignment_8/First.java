package Assignment_8;

import java.util.Scanner;

public class First {
    public static boolean isStringOnlyAlphabet(String str)
    {
        return (
                (str != null) && (!str.isEmpty())
                && (str.chars().allMatch(Character::isLetter))
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str1 = sc.next();

        System.out.println("\nOutput: "
                + isStringOnlyAlphabet(str1));
    }
}
