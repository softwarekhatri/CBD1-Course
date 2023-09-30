package classes.class6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class ListClass {

    public static void main(String[] args) {
        // 1. List [interface] has add() and arrayList has also add method
        // In this case if you call method then arraylist add method will be invoked

        // 2. List has not addFirst() method but linkedlist has
        // In this case if you call addFirst on list, it will give you error.

        // 3. Vector has add() method and stack has not add method but it extends Vector
        // In this case if you call add on stack object, it will add of vector class

        List<Integer> list = new ArrayList<>();
        boolean isInserted = list.add(1000);
        list.add(3000);
        list.add(5000);

        Integer object = 30;
        boolean removedValue = list.remove(object);
        // System.out.println("removed : " + removedValue); // 20
        // System.out.println(list); // 10, 30, 40

        // System.out.println(list);
        // list.set(0, 50000);
        // System.out.println(list);

        Set<Integer> list2 = new HashSet<>();
        list2.add(1000);
        list2.add(3000);
        list2.add(5000);

        System.out.println(list.toString());
        // System.out.println(list2);

        // boolean isAdded = list.removeAll(list2);
        // if (isAdded) {
        // System.out.println(list);
        // System.out.println(list2);
        // }

        // common stuff --> final output
        // 1000, 3000
        // System.out.println(list); // 1000, 3000, 5000
        // System.out.println(list2); // 1000, 3000, 5000
        // System.out.println("========================");
        boolean ok = list.retainAll(list2);
        // System.out.println(ok);
        // System.out.println(list);
        // System.out.println(list2);

        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
