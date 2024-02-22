package LeetCode;

import java.util.Iterator;
import java.util.LinkedList;

public class MiddelOfLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> al=new LinkedList<Integer>();
        al.add(12);
        al.add(1);
        al.add(3);
        al.add(7);
        al.add(89);

        Iterator<Integer> itr=al.iterator();

        System.out.println(1+al.size()/2);

        while (itr.hasNext()){

            System.out.print(itr.next() + " ");
        }
    }


}
