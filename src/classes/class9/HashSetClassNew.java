package classes.class9;

import java.util.TreeSet;

public class HashSetClassNew {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        System.out.println(treeSet); // 100
        treeSet.add(null); // NPE
        System.out.println(treeSet);
    }
}
