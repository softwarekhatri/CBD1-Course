package classes.class2;

public class StringBufferClass {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Ankit");
        StringBuffer s2 = new StringBuffer("Khatri");
        System.out.println(s1.hashCode()); // A
        System.out.println(s2.hashCode()); // B
        System.out.println("=====================================");
        s1.append(s2);
        System.out.println(s1.hashCode()); // A
    }
}
