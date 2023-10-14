package classes.class9;

public class GenericClass<T> {

    public void toPrint(T obj) {
        System.out.println(obj);
    }

    <Y> void toReturn(Y body) {

    }

    public <Y> void toReturn2(Y body) {

    }
}
