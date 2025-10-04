package JDBC_Revisit;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/First";
        String sql = "SELECT * FROM imp_info WHERE id > 3;";

        try {
            Connection con = DriverManager.getConnection(url, "postgres", "1234");
            System.out.println("connection established !");

            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(sql);

            while (r.next()) {
                System.out.print(r.getInt(1) + " ");
                System.out.print(r.getString(2) + " ");
                System.out.print(r.getString(3));
                System.out.println();
            }

            con.close();
            System.out.println("Connection is closed now !");

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Something went wrong in connecting with database !");
        }
    }
}
