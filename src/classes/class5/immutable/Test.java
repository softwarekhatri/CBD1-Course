package classes.class5.immutable;

public class Test {

    public static void main(String[] args) {
        // 1. To make the class final -> you are not allowed to inherit or create child
        // class
        // 2. Hides the setter method
        // 3. Only provide getter method
        ImmutableString immutableString = new ImmutableString("Ankit");
        // System.out.println(immutableString.getValues());
        // System.out.println(immutableString.hashCode());
        // immutableString.setValue("Khatri");
        // System.out.println(immutableString.getValues());
        System.out.println(immutableString.hashCode());

        ImmutableString immutableString2 = new ImmutableString("Khatri");
        System.out.println(immutableString2.hashCode());
    }
}
