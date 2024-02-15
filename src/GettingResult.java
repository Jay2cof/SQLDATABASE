import java.sql.*;

public class GettingResult {
    public static void main(String[] args) {
        try {
            Connection connects = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "onu101cj");
            System.out.println("connected");

            // retrieving an object from the database can be used applying Resultset.

            Statement resultData = connects.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet data = resultData.executeQuery("SELECT * FROM subjects");
            data.absolute(3); // getting data from first row
            System.out.println(data.getInt(1));
            System.out.println(data.getString(2)); // or use column label grade
            System.out.println(data.getString(3));
            System.out.println(data.getString(4));

        }
        catch(SQLException D){
            D.printStackTrace();
        }

    }
}
