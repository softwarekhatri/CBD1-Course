package classes.class10;

import java.util.*;
import java.util.stream.Collectors;

public class StreamClass2 {
    public static void main(String[] args) {
        List<String> countriesList = new ArrayList<>(Arrays.asList("India", "Africa", "China", "North Africa", "US"));

        // usecase -> extract all the countries name which is having even number of
        // letters
        // List<String> filteredList = new ArrayList<>();
        // for (String country : countriesList) {
        // if (country.length() % 2 == 0) {
        // filteredList.add(country);
        // }
        // }
        // System.out.println(filteredList);
        //
        // List<String> output = countriesList.stream().filter(country -> country.length() % 2 == 0).collect(Collectors.toList());
        // System.out.println(output);
        //
        // List<Character> filteredList = new ArrayList<>();
        // for (String country : countriesList) {
        // if (country.length() % 2 == 0) {
        // filteredList.add(country.charAt(0));
        // }
        // }
        // System.out.println(filteredList);
        //

        Integer[] list = countriesList.stream().filter(country -> country.length() % 2 == 0).map(country -> country.charAt(0)).toArray(Integer[]::new);
         System.out.println(Arrays.toString(list));

//        Integer[] arr = { 10, 80, 190, 2890, 780, 2870, 8720 };
//        System.out.println("==================================");
//        for (Integer data : arr) {
//            System.out.println(data);
//        }
//
//        long length = Arrays.stream(arr).count();
//        System.out.println(length);

    }
}
