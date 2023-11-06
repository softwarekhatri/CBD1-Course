package classes.class17;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Abc", 10000, "IT", 45),
                new Employee("Ram", 40000, "Devops", 35),
                new Employee("Xyz", 35000, "Marketing", 55),
                new Employee("Xyz", 50000, "Marketing", 45),
                new Employee("Ankit", 40000, "Sales", 65),
                new Employee("Ankia", 40000, "Finance", 37)
        };
        for (Employee e : employees) {
            System.out.println(e);
        }
        Arrays.sort(employees, (e1, e2) -> e2.dept.compareTo(e1.dept));
        System.out.println("================= After Sorting==============");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
