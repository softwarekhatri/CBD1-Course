package classes.class9;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List list1 = new ArrayList<>(); // 10 employee + 5 departments
        list1.add(100);
        list1.add("Ankit");

        Object a = list1.get(1);
        if (a instanceof Integer) {
            System.out.println((Integer) a);
        } else if (a instanceof String) {
            System.out.println((String) a);
        }
        // System.out.println(list1);

        // List list2 = new ArrayList<>(); // departments

        // GenericClass genericClass = new GenericClass<>();
        // genericClass.toPrint(100);
        // genericClass.toPrint("Ankit");
        // genericClass.toPrint(23089.873f);
    }
}
