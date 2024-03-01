import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
            //preparedstatment give us opp to insert data not directly into SQL
            PreparedStatement createObj = connect.prepareStatement("insert into subjects values(?,?,?,?)");

            createObj.setInt(1,score);
            createObj.setString(2,grade);
            createObj.setString(3,course);
            createObj.setString(4,name);

            int update = createObj.executeUpdate();// we can do without the int update, just call on the createObj
            System.out.println(update + "Data is inserted");
            createObj.close();

        } catch (SQLException C) {
            C.printStackTrace();
        }
    }
}
