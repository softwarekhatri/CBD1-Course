package classes.class1;

public class Class1 {

    public static void main(String[] args) {
        // Can I create the array of size 0?
        int[] arr = new int[0];
        System.out.println(arr[0]);
        // printArray(new int[] { 10, 20, 30, 40, 50 });
    }

    /* It will print the array values */
    private static void printArray(int[] array) {
        for (int a : array) {
            System.out.println(a);
        }
    }

}
