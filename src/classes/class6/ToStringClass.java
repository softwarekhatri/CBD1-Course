package classes.class6;

public class ToStringClass {

    static class Employee {
        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Emp[id = " + id + ", name = " + name + "]";
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(10, "Ankit");
        float[][][] arr = new float[10][10][10];
        System.out.println(arr);
    }
}
