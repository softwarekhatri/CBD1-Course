package classes.class2;

public class StringClass {

    public static void main(String[] args) {
        String s1 = new String("Ankit");
        String s2 = new String("Khatri");
        System.out.println(s1.hashCode()); // A
        System.out.println(s2.hashCode()); // B
        System.out.println("=====================================");
        s1 = s1 + s2;
        System.out.println(s1.hashCode()); //
    }
}
