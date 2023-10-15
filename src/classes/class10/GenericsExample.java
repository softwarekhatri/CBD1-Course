package classes.class10;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample<T> {
    public static void main(String[] args) {
        List gb = new ArrayList();
        gb.add(100);
        gb.add("Skgriu");
        System.out.println(gb);
    }
}
