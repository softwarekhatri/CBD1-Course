package classes.class7;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1000);
        set.add(4000);
        set.add(209);
        set.add(801);
        set.add(102780);
        System.out.println(set); // [40, 80, 100, 200]
        System.out.println(set.first());

        //
        // 100 , 20 ==> visited
        // [20 ->
        // [50, 20, 300]

        // Set<Integer> toRemove = new HashSet<>();
        // for (Integer val : set) { // [20, 50, 300, 900, 100]
        // if (val % 2 == 0) {
        // toRemove.add(val);
        // }
        // }

        // set.removeAll(toRemove);
        // System.out.println(set);
        // boolean isPresent = set.contains(668897);
        // System.out.println(isPresent);
    }
}
