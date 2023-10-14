package classes.class9;

import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        CustomList<Float> list = new CustomList<>();
        list.add(78483.4387f);
        list.add(834734.33f);
        list.add(437847.734f);
        list.add(87347834.3434f);

        // System.out.println(list);
        // System.out.println(list.get(2));
        // list.set(3, 8734874.4387f);
        // System.out.println(list);

        CustomMap<Integer, List<String>> map = new CustomMap<>();
        map.put(5, Arrays.asList("gems", "biscuit", "toffess"));
        map.put(5000, Arrays.asList("mobile", "oven", "mixer"));
        map.put(50000, Arrays.asList("laptop", "smartPhone"));
        System.out.println(map);

        System.out.println(map.get(5000));
        System.out.println(map.get(3877823));
        System.out.println(map.getOrDefault(76236, Arrays.asList("Default Value", "must be added")));

        GenericClassNew<Integer, String, Float> obj = new GenericClassNew<>();

    }
}
