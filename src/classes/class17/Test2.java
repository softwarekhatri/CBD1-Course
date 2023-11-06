package classes.class17;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        String[] str = { "Ankit", "Ankia", "Ram", "Abhishek", "Kaushal", "Shyam" };

        // Arrays.sort(str, new StringComparator());

        // Arrays.sort(str, new Comparator<String>() {
        // @Override
        // public int compare(String s1, String s2) {
        // if (s1.length() == s2.length()) {
        // return 0;
        // } else if (s1.length() < s2.length()) {
        // return -1;
        // } else {
        // return 1;
        // }
        // }
        // });

        Arrays.sort(str, (s1, s2) -> s2.compareTo(s1));

        for (String s : str) {
            System.out.println(s);
        }
    }

    public static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            Integer s1Length = s1.length(); // 4
            Integer s2Length = s2.length(); // 6
            // desc
            return s2Length.compareTo(s1Length);
            // asc
            // return s1Length.compareTo(s2Length);
        }
    }
}
