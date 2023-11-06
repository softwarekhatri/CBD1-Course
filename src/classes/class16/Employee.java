package classes.class16;

// 
public class Employee implements Comparable<Employee> {

    public String name;
    public double salary;
    public int age;
    public String dept;

    public Employee() {

    }

    public Employee(String name, double salary, String dept, int age) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    /**
     * @param anotherEmployee
     * @return
     *         based on age --> we want to sort
     *         0 => If both objects are equals
     *         +1 => If first employee is greater than second employee
     *         -1 => If first employee is smaller than second employee
     */
    @Override
    public int compareTo(Employee secondEmployee) {
        if (this.salary == secondEmployee.salary) {
            return 0;
            // if (this.age == secondEmployee.age) {
            // return 0;
            // } else if (this.age < secondEmployee.age) {
            // return -1;
            // } else {
            // return 1;
            // }
        } else if (this.salary < secondEmployee.salary) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return "Employee[age=" + age + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
    }
}
