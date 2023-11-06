package classes.class17;

import java.util.Comparator;

public class EmployeeSortBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee firstEmployee, Employee secondEmployee) {
        if (firstEmployee.salary == secondEmployee.salary) {
            return 0;
        } else if (firstEmployee.salary < secondEmployee.salary) {
            return -1;
        } else {
            return 1;
        }
    }

}
