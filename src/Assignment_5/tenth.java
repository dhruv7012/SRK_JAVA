package Assignment_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class tenth {

    public static void main(String[] args) {
        String[] t = {"tar", "rat", "art", "meats", "steam"};
        ArrayList<ArrayList<String>> a = new ArrayList<>();

        ArrayList<String> subArray = new ArrayList<>();

        for (int i = 0; i < t.length; i++) {
            subArray.add(t[i]);
            for (int j = 0; j < t.length; j++) {
                if (isTheySame(subArray.get(i), t[j])) {
//                    System.out.println(
//                            "Element are Same : "
//                            + subArray.get(i) + " "
//                            + t[j]
//                    );
                    addDataToArray(subArray, t[j]);
                }
            }
            a.add(i, subArray);

        }

        for (int i = 0; i < subArray.size(); i++) {
            System.out.println(subArray.get(i));
        }

    }

    public static void addDataToArray(ArrayList<String> arr, String value) {

        for (int i = 0; i < arr.size(); i++) {
            if (!Objects.equals(arr.get(i), value)) {
                if (arr.get(i) == null) {
                    arr.set(i, value);
                    break;
                }
            }
        }
    }

    public static boolean isTheySame(String a, String b) {

        if (Objects.equals(sortByLetter(a), sortByLetter(b))) {
            return true;
        }

        return false;
    }

    public static String sortByLetter(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        return sorted;
    }

}
