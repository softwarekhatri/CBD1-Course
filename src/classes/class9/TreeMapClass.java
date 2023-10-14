package classes.class9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "India");
        map.put(2, "USA");
        map.put(4, "Data");
        map.put(3, "Africa");

        // [1, 2, 3]
        // map - [O(1) -> for all operations]
        // for(Integer key: map.keySet()){
        //     System.out.println(key + " : " + map.get(key));
        // }

        //[{1:India}, {2:USA}]
        for(Entry<Integer, String> entries:  map.entrySet()){
            System.out.println(entries.getKey() + " : " + entries.getValue());
        }

        // map.entrySet()
        // Iterable
        // while(map.keySet())
        
    }
}
