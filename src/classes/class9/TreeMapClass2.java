package classes.class9;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "India");
        map.put(20, "America");
        map.put(2, "USA");
        map.put(339, "Los Angles");
        map.put(4, "Data");
        map.put(-132, "Australia");
        map.put(3, "Africa");
        map.put(null, "kjhdk");
        System.out.println(map); // [] ==> collections + arrays
        // {} ==> represents map + hashtable

        // [1, 2, 3]
        for(Integer key: map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
