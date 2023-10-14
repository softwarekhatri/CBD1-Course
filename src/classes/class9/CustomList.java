package classes.class9;

import java.util.ArrayList;
import java.util.List;

// T ==> student
public class CustomList<T> {

    List<T> list = new ArrayList<>();

    public void add(T obj) {
        list.add(obj);
    }

    public T get(int idx) {
        return list.get(idx);
    }

    public void set(int idx, T data) {
        list.set(idx, data);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Object a : list) {
            sb.append(a);
            sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
