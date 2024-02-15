package Assignment_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Tenh {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "fat", "jak"};
        List<List<String>> ans = stringListAnagrams(str);
        System.out.println(ans);
    }

    static List<List<String>> stringListAnagrams(String[] str) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i] == "&") {
                continue;
            }

            char[] i_charArr = str[i].toCharArray();
            Arrays.sort(i_charArr);

            if (!map.containsKey(Arrays.toString(i_charArr))) {
                map.put(Arrays.toString(i_charArr), new ArrayList<>());
            }
            for (int j = 0; j < str.length; j++) {
                if (str[j] == "&") {
                    continue;
                }

                char[] j_charArr = str[j].toCharArray();
                Arrays.sort(j_charArr);

                if (Arrays.equals(i_charArr, j_charArr)) {
                    map.get(Arrays.toString(i_charArr)).add(str[j]);
                    str[j] = "&";
                }
            }
        }

        List<List<String>> ansList = new ArrayList<>(map.values());

        return ansList;
    }
}