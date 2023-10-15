package classes.class10;

import java.util.Arrays;
import java.util.List;

public class Employee {

    public Employee(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public int id;
    public String name;
    String email;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Ankit", "ankit@gmail.com", 23878.0),
                new Employee(2, "Ramesh", "ramesh@yahoo.com", 78873.00),
                new Employee(3, "Suresh", "suresh@micrsoft.com", 34723.00),
                new Employee(4, "Ram", "ram@fb.com", 26823.00),
                new Employee(5, "Sita", "sita@apple.com", 37733.00),
                new Employee(6, "Gaytri", "gaytri@gmail.com", 73732.27)
        );
    }

    public String getFormattedName(){
        return "Mr. " + this.name;
    }
}
