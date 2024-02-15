import java.sql.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        try{ // adding data into the SQL Database
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "onu101cj");
            System.out.println("connected");

            Statement sql = connect.createStatement();// statement class execute sql query when ever the app is compiled.
            sql.executeUpdate("insert into students values(23, 'jay', 'jay@aol.com')");


            Statement newsql = connect.createStatement();
            newsql.executeUpdate("insert into students values(44, 'leo', 'leo@aol.com')");

            Statement jay_file = connect.createStatement();
            jay_file.executeUpdate("insert into students value (99, 'jay', 'jayboi@gmai.com')");


            Connection connects = DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root", "onu101cj");
            System.out.println("connected");

            Statement grades = connects.createStatement();
            grades.executeUpdate("insert into subjects values (55, 'Pass', 'Biology', 'ade')");

            Statement grade = connects.createStatement();
            grade.executeUpdate("insert into subjects values (30, 'Fail', 'Chemistry', 'Ayo')");

            Statement mygrade = connects.createStatement();
            mygrade.executeUpdate("insert into subjects values (22, 'A', 'Mathematics','sam')");
            mygrade.close();


        }
        catch(SQLException E){
            E.printStackTrace();
        }
    }

}