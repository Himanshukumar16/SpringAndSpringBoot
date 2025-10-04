package JDBC_Revisit;
import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/First";
        try {
            Connection con = DriverManager.getConnection(url,"postgres","1234");
            System.out.println("connection established !");
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Something went wrong in connecting with database !");
        }

    }
}
