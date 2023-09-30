package classes.class6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListClass {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        // 100 add();
        al.add(1000);
        // 50k
        display(al);
        printSize(al);
        addValueToFirstInList(al, 20);
        System.out.println("=========================");
        display(al);
        List<Integer> nval = returnValue(al);
    }

    /** This function will display the list items */
    private static void display(List<Integer> al) {
        for (Integer val : al) {
            System.out.println(val);
        }
    }

    private static void addValueToFirstInList(List<Integer> al, int value) {
        if (al instanceof ArrayList) {
            // add first to arraylist
            ArrayList<Integer> al2 = (ArrayList) al;
            al2.set(0, value);
        } else if (al instanceof LinkedList) {
            LinkedList<Integer> ll = (LinkedList) al;
            ll.addFirst(value);
        }
    }

    /** This function will display the list size */
    private static void printSize(List<Integer> al) {
        System.out.println(al.size());
    }

    /** This function will returnValue the list items */
    private static List<Integer> returnValue(List<Integer> al) {
        return al;
    }
}
