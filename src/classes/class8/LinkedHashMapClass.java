package classes.class8;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "India");
        map.put(2, "Pak");
        map.put(2387, "Africa");
        map.put(4, "Los Angles");
        map.put(null, null);

        String a = map.getOrDefault(200 ,"Default Value");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1030, "India");
        map2.put(212, "USA");
        map2.put(3393, "PAK");

        map.putAll(map2);
        System.out.println(map);
    }
}
