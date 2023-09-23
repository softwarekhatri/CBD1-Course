package classes.class4;

public class Student implements Cloneable{

    private String name; // Ankit
    private String fathersName; // ABC
    private int age; // 70
    private StudentAddress address; // {hNo -> A-47, city -> Delhi}
    private Student[] friends; // [{name -> Yogesh, fathersNam -> xyz, friends -> []}, {name -> Ramesh, age ->
                               // 60}]

    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.age = 10;
        s.name = "Ankit";
        System.out.println(s.age); // 10
        System.out.println(s.name); // Ankit
        System.out.println(s.hashCode());

        Student s1 = (Student) s.clone();
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.hashCode());
    }
}
