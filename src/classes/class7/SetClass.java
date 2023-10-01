package classes.class7;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        boolean added = set.add(100);
        System.out.println("Added 100 : " + added);
        added = set.add(0);
        System.out.println("Added 0 : " + added);
        added = set.add(300);
        System.out.println("Added 100 : " + added);
        System.out.println(set);
        // boolean isRemoved = set.remove(100);
        // System.out.println("100 got removed: " + isRemoved);
        // isRemoved = set.remove(10000);
        // System.out.println("10000 removed " + isRemoved);
        // System.out.println(set);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(100);
        set2.add(0);

        set.retainAll(set2);
        System.out.println(set);// [100, 0]
    }
}
