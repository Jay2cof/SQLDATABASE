import java.sql.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "onu101cj");
            System.out.println("connected");

            Statement sql = connect.createStatement();
            sql.executeUpdate("insert into students values(23, 'jay', 'jay@aol.com')");
            connect.close();


        }
        catch(SQLException E){
            E.printStackTrace();
        }
    }

}