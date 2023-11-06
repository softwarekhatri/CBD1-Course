package classes.class17;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Test3 {
    public static void main(String[] args) {
        PriorityQueue<Employee> pq = new PriorityQueue<>((e1, e2) -> e1.salary.compareTo(e2.salary));
        pq.add(new Employee("Abc", 10000, "IT", 45));
        pq.add(new Employee("Ram", 40000, "Devops", 35));
        pq.add(new Employee("Xyz", 35000, "Marketing", 55));
        pq.add(new Employee("Xyz", 50000, "Marketing", 45));
        pq.add(new Employee("Ankit", 40000, "Sales", 65));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
