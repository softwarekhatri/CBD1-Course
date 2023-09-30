package classes.class6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class CollectionClass {

    static class Parent {
        void m1() {
            System.out.println("M1 method in parent");
        }
    }

    static class Child extends Parent {
        void m1() {
            System.out.println("M1 method in child");
        }
    }

    public static void main(String[] args) {
        Parent p = new Child();
        // p.m1();

        // float c = null;
        Byte s = null;

        List<Integer> list = new ArrayList<>(null);
        System.out.println(list);
        // list.add(100000);
        // Collections.sort(list);
        // List<Integer> list2 = Collections.emptyList();
        // System.out.println(list2);
    }
}
