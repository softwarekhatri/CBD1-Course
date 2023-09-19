package classes.class3;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Ankit Khatri
 */
public class ExceptionClass3 {
    public static void main(String[] args) throws IOException {
        int ans = divide10ByValue(0);
        System.out.println(ans);

        // open a database connection
        // query to the database
        // close the database connection --> Why important?
        // return the value

        // Connection c = null;
        try(FileReader fileReader = new FileReader("text.html")){
            // open a database connection [c = new MYSQLConnection();]
            // query to the database [c.query("fieieooee');
        }

        // create object -> It has reference to the memory
        // String s = new String("Ankit);
        // s.concat("Khatri");
        // s = null;

    }

    private static int divide10ByValue(int divisor){
        try{
            return 10 / divisor;
        } finally {
            System.out.println("system executed successfully");
        }
    }
}
