package POO.Qexceptions.runtime.teste;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionsTeste04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }


        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println("Dentro de SQLException | FileNotFoundException");
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
    }

}
