import java.sql.*;

public class FetchingAllRecordsFromDatabase {
    public static void main(String[] args) {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/Justice_machine", "root", "onu101cj");
            System.out.println("connected");

            PreparedStatement machine = connect.prepareStatement ("Select * from Jay_machine");
            ResultSet result = machine.executeQuery();

            while(result.next()){ // when the size of the value is not define, you use the whileloop, and the for a value that is not defined
                System.out.println("machine_name: " + result.getString(1));
                //System.out.println("machine_name: " + result.getString("machine_name"));  using column name
                System.out.println("machine_id: "+ result.getInt(2));
                System.out.println("machine_age: " + result.getInt(3));
                System.out.println("machine_location: " + result.getString(4));
                System.out.println("machine_Type: " + result.getString(5));
                System.out.println();
            }
            connect.close();

        }
        catch(SQLException H){
            H.printStackTrace();
        }

    }

}
