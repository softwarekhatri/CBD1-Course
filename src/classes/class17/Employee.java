package classes.class17;

public class Employee {

    public String name;
    public Double salary;
    public Integer age;
    public String dept;

    public Employee() {

    }

    public Employee(String name, double salary, String dept, int age) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String toString() {
        return "Employee[age=" + age + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
    }
}
