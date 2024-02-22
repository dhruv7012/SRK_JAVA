package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NewSuck {

    public static boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.')
                    continue;
                final char c = board[i][j];
                if (!seen.add(c + "@row" + i) ||
                        !seen.add(c + "@col" + j) ||
                        !seen.add(c + "@box" + i / 3 + j / 3))
                {
                    System.out.println(seen.stream().toList().toString());
                    return false;
                }
            }
    System.out.println(seen);

        return true;
    }

    public static void main(String[] args) {

        char[][] su =
                {
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '5', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                };

        System.out.println(isValidSudoku(su));


    }
}
