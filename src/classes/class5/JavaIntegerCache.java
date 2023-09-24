package classes.class5;

public class JavaIntegerCache {

    public static void main(String[] args) {
        // -128 to 127
        // Integer g = 1809;
        // Integer h = 1809;
        // System.out.println(g == h); // False

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // True

        // String p1 = "Delhi";
        // String p2 = "Delhi";

        // String s = new String("Ankit");
        // String s1 = new String("Ankit");
        // // System.out.println(s.equals(s1)); // Ankit == Ankit --> True
        // System.out.println(p1 == p2); // memoryS == memeoryS1 --> False
    }
}
