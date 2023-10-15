package classes.class10;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {
        String[] arr = { "Value1", "Value2", "Value3" };
        Integer[] intArr = { 10, 20, 30, 40, 50 };
        Stream<Integer> s = Stream.of(intArr);
        // s.forEach(System.out::println); // Value1, Value2, Value3

        // for (int i = 1; i < 11; i++) {
        // System.out.println(i);
        // }
        // System.out.println("============================");
        // IntStream.range(1, 11).forEach(System.out::println);

        // for (int i = 1; i < 21; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

        // IntStream.range(1, 21).filter(i -> i % 2 == 0).forEach(System.out::println);

        int sum = 0;
        for (int i = 1; i < 51; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        int totalSumUpto50 = IntStream.range(1, 51).filter(val -> val % 2 != 0).sum();
        System.out.println(totalSumUpto50);

        // print(3, new String[] { "Ankit", "Khatri", "Delhi" });
        // print(3, "Ankit", "Khatri");
    }

    // var-args paramaters
    // 1. It is used when you don't know how many parameters can come / would be
    // there
    // 2. Var-arg internally acts as an array [fixed when being executed]
    private static void print(Integer length, String... data) {
        int size = length;
        System.out.println("The length of the array is " + size);
        for (String d : data) {
            System.out.println(d);
        }
    }
}
