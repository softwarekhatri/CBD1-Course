package classes.class5.singleton;

public class MySingleton {

    // 1. By creating a new object and then object.value
    // 2. Make the member variable as static
    private static MySingleton instance;

    private MySingleton() {
        // no initalization
    }

    public static MySingleton createObject() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }

}
