package classes.class3;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Ankit Khatri
 */
public class ExceptionClass2 {

    public static void main(String[] args) {
        try {
            getException(10); // whatever statements we write in try block, it may or may not throw exception
        } catch(IOException e){
            System.out.println("Okay solved IOE");
        } catch(SQLException e){
            System.out.println("Okay solved SQE");
        } finally {
            System.out.println("OKAY everything is handled");
        }
        System.out.println("Last line");
        // try can not be used alone, it must require catch block or finally block
        // finally block & catch can not be used alone, it requires try block
        // finally block says, whether you handle the exception or not handling the exception or even returning by return keyword, I'll execute
        // try -> catch -> finally [when corresponding catch block is available to handle exception]
        // try -> finally -> exception thrown [when corresponding catch block is NOT available to handle exception]
        // try -> finally [when there is no error]

        // try with resource is nothing but try with finally
    }

    private static void getException(int a) throws RuntimeException, SQLException, IOException{
        switch (a){
            case 1:
                throw new NullPointerException("NPE");
            case 2:
                throw new ClassCastException("CCE");
            case 3:
                throw new ArithmeticException("AQE");
            case 4:
                throw new SQLException("SQE");
            case 5:
                throw new IOException("IOE");
        }
    }
}
