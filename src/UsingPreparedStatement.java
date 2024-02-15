import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class UsingPreparedStatement {
    public static void main(String[] args) {
        //the query gets executed only once when the app is complied, which makes the app faster becos its complied once.
        Scanner user = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = user.nextInt();
        System.out.println("Enter your grade: ");
        String grade = user.next();
        System.out.println("Enter your course: ");
        String course = user.next();
        System.out.println("Enter your name: ");
        String name = user.next();

        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "onu101cj");
            System.out.println("connected");
        } catch (SQLException C) {
            C.printStackTrace();
        }
    }
}
