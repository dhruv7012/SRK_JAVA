package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class HSHDG {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> ll = new ArrayList<ArrayList<Character>>
                (

                );

        ArrayList<Character> x1 = new ArrayList<>
                (
                        Arrays.asList('5', '1', '.', '.', '7', '.', '.', '.', '.')
//                        i = 0 ; j = 0 ; k = 0
                );
        ArrayList<Character> x2 = new ArrayList<>
                (
                        Arrays.asList('1', '5', '8', '3', '7', '7', '.', '.', '.')
//                        i = 1 ; j = 0 ; k = 0
                );

        ll.add(x1);
        ll.add(x2);


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 9; k++) {

                    if (ll.get(i).stream().toList().get(j) == ll.get(i).stream().toList().get(k) && ll.get(i).stream().toList().get(j) != '.' && ll.get(i).stream().toList().get(k) != '.' && j != k) {
                        System.out.println(ll.get(i).stream().toList().get(j));
                        System.out.println("Matched in row");
                    }

                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 2; k++) {

                    if (ll.get(i).stream().toList().get(j) == ll.get(k).stream().toList().get(j) && ll.get(i).stream().toList().get(j) != '.' && ll.get(k).stream().toList().get(j) != '.' && i != k) {
                        System.out.println(ll.get(i).stream().toList().get(j));
                        System.out.println("Matched in column");
                    }

                }
            }
        }

        for (int p = 0; p < 9; p += 3) {
            for (int i = 0; i < ll.size(); i++) {
                for (int j = p; j < p + 3; j++) {
                    for (int k = 0; k < ll.size(); k++) {
                        for (int q = p; q < p + 3; q++) {

                            if (
                                    ll.get(i).stream().toList().get(j)
                                            ==
                                            ll.get(k).stream().toList().get(q)
                                            &&
                                            ll.get(i).stream().toList().get(j)
                                                    != '.' &&
                                            ll.get(k).stream().toList().get(q)
                                                    != '.'
                                            && j != q
                            ) {
                                System.out.println(ll.get(i).stream().toList().get(j));
                                System.out.println("Matched in box");
                                System.out.print("i " + i);
                                System.out.print(" and j " + j);
                                System.out.print(" and k " + k);
                                System.out.print(" and q " + q);
                                System.out.println();
                                System.out.println();
                            }

                        }
                    }
                }
            }
        }


//
//        char[][] su =
//                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
//                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
//                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
//                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
//                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
//                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
//                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
//                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
//                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
//
//
//
    }

}
