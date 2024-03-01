import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatingUsingPreparedStatement {
    public static void main(String[] args) {
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "onu101cj");
            System.out.println("connected");
            PreparedStatement update = connect.prepareStatement("update subjects set subject_name =? where subject_name =? "); //set =new, where = old, set always before where.
            update.setString(1, "jamjam");
            update.setString(2,"MUSA");
            int table = update.executeUpdate();
            System.out.println(table);
        }
        catch(SQLException H){
            H.printStackTrace();
        }
    }
}
