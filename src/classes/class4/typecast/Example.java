package classes.class4.typecast;

/**
 * @author Ankit Khatri
 */
public class Example {

    public static void main(String[] args) {
        String s = "Ankit";
        Object object = (Object) s;

        StringBuffer sb = (StringBuffer) object;
        System.out.println(sb);
    }
}
