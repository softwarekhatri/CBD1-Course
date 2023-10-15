package classes.class10;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamClass3 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployees();

        // Set<String> names = employeeList.stream().filter(employee -> employee.salary
        // > 35000.00)
        // .map(Employee::getFormattedName).collect(Collectors.toSet());
        // System.out.println(names);

        List<Employee> names = employeeList.stream().filter(employee -> employee.email.contains("@gmail.com"))
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
