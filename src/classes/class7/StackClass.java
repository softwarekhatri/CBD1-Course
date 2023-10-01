package classes.class7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class StackClass {

    public static void main(String[] args) {
        // Stack<Integer> st = new Stack<>();
        // System.out.println("Is stack empty: " + st.isEmpty());
        // st.push(10);
        // st.push(20);
        // System.out.println(st);
        // System.out.println("Is stack empty: " + st.isEmpty());
        // System.out.println("top value = " + st.peek());
        // System.out.println(st);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);

        for (int i = al.size() - 1; i >= 0; i--) {
            if (al.get(i) % 2 == 0) {
                al.remove(i);
            }
        }

        boolean isPresent = al.contains(100);
        System.out.println(al);
        System.out.println(al.size());
    }
}
