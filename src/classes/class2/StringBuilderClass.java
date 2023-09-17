package classes.class2;

public class StringBuilderClass {
    public static void main(String[] args) {
        // 34 x 2 => 68
        StringBuilder s1 = new StringBuilder(); // Mutuable
        s1.append("12345678901234568997686887979878786686887888686688688686");
        System.out.println(s1.capacity());
    }
}
