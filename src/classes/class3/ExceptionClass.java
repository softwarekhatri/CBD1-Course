package classes.class3;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionClass {

    public static void main(String[] args){
        try {
            getException(1);
        } catch(RuntimeException e){
            System.out.println("Okay solved RE");
        } catch(SQLException e){
            System.out.println("Okay solved SQE");
        } catch(IOException e){
            System.out.println("Okay solved IOE");
        } catch (Throwable e){
            System.out.println("OKAY MASTER IS HERE");
        }
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
            default:
                throw new RuntimeException("RE");
        }
    }

    private static String getMessage(String str) throws Exception{
        if(str == null){
            throw new Exception("String value can not be null");
        }
        return "Welcome to the city " + str;
    }

    private static int divide(int num1, int num2) {
        int res = 0;
        try {
            res = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Null pointer exception came");
        } catch (NullPointerException e){
            System.out.println("Please provide some values");
        }
        return res;
    }
}