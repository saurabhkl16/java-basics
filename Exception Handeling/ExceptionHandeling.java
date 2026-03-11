
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class ExceptionHandeling {

    public static void main(String[] args) {
        //=============================
        // ## Un-checked Exceptions ##
        //=============================
        // These exceptions occur at runtime and are not checked by the compiler.

        // Examples:-
        // NullPointerException
        String name = null;

        // ArrayIndexOutOfBoundsException
        // NumberFormatException
        String num = "abc";
        try {
            int number = Integer.parseInt(num); // Exception
            System.out.println(number);

        } catch (Exception e) {
            System.out.println("String cantains characters, so can't convert to integer");
        }

        // ArithmeticException
        Scanner sc = new Scanner(System.in);

        // System.out.print("Please enter x:");
        // int x = sc.nextInt();
        // while (true) {
        //     try {
        //         System.out.print("Please enter y:");
        //         int y = sc.nextInt();
        //         long division = x / y;
        //         System.out.println("division:" + division);
        //         break;
        //     } catch (ArithmeticException e) {
        //         System.out.println("Can not devide by zero. Please enter number > 0");
        //     }
        // }
        //=============================
        // ## Checked Exceptions ##
        //=============================
        // These exceptions are checked at compile time.
        // The compiler forces you to handle them using try-catch or throws.
        // Examples:-
        // IOException: Occurs during input/output operations like reading a file.
        try {
            FileReader file = new FileReader("test.txt");
            file.read();
            file.close();
        } catch (Exception e) {
            System.out.println("IO error");
        }

        // SQLException: Occurs when there is an error in database operations.
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/login_db",
                    "root",
                    "Saurabh"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

        } catch (SQLException e) {
            System.out.println("Database error occurred" + e);
        }
        // FileNotFoundException
        // ClassNotFoundException
    }
}
