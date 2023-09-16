package classes.class1;

public class Class1N {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(arr[3]); // 4
        printArray(arr);
        System.out.println(arr[3]); // 4
    }

    private static void printArray(int[] array) {
        array = new int[] { 10, 20, 30, 40, 50, 60, 70, 80 };
        System.out.println(array[3]); // 40
    }

}
