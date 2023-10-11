package classes.class8;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "India");
        map.put(212, "USA");
        map.put(3, "PAK");
        System.out.println(map);
        // String value = map.get(3);
        // System.out.println(value);
        // System.out.println(map.get(100)); // null
        // System.out.println(map.containsKey(1)); // true
        // System.out.println(map.containsKey(100)); // false
        map.put(13200,null); // {100=null}
        map.put(200,null); // {200=null}
        map.put(1,null);
//------------------------------------------
        map.put(null, "Africa");
        map.put(null, "America");
        System.out.println(map);
    }
}
