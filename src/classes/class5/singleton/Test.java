package classes.class5.singleton;

public class Test {

    public static void main(String[] args) {
        // 1. To make constructor private
        // 2. Create a static variable with private of same class
        // Type
        // 3. Expose [Publicly] a static method to get the instance.
        // some condition -> create object if member variable is null else return the
        // same member variable

        MySingleton instance1 = MySingleton.createObject();
        // instance1.s = "Some value1";
        System.out.println(instance1.hashCode());
        MySingleton instance2 = MySingleton.createObject();
        System.out.println(instance2.hashCode());
        MySingleton instance3 = MySingleton.createObject();
        System.out.println(instance3.hashCode());
        MySingleton instance4 = MySingleton.createObject();
        System.out.println(instance4.hashCode());
        MySingleton instance5 = MySingleton.createObject();
        System.out.println(instance5.hashCode());
    }
}
