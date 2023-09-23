package classes.class4;

public class Polymorphism {

    /*
     * overloading (compile time polymorphism) [static binding]
     * Method name should be same
     * Return type should be same / different
     * if different returnType -> you can not use same input (datatype + number of
     * arguments)
     * if same returnType -> when you input is different
     */
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static String sum(int num1, int num2, int num3) {
        return String.valueOf(num1 + num2 + num3);
    }

    public static void main(String[] args) {
        Object res = sum(10, 20);
        System.out.println(res.getClass());
    }
}
