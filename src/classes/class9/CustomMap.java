package classes.class9;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CustomMap<Key, Value> {

    LinkedHashMap map = new LinkedHashMap<>();

    public void put(Key key, Value val) {
        map.put(key, val);
    }

    public Value get(Key key) {
        return (Value) map.get(key);
    }

    public int size() {
        return map.size();
    }

    public Value getOrDefault(Key key, Value defaultValue) {
        return (Value) map.getOrDefault(key, defaultValue);
    }

    public String toString() {
        return map.toString();
    }
}
