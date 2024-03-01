import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DelectingUsingPreparedStatement {
    public static void main(String[] args) {

        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "onu101cj");
            System.out.println("connected");

            PreparedStatement delete = connect.prepareStatement("delete from subjects where grade = ?");
            delete.setString(1, "pass");
            int update = delete.executeUpdate();
            System.out.println(update);
        }
        catch(SQLException J){
            J.printStackTrace();

        }


    }
}
