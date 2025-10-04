package JDBC_Revisit;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5433/First";
        String sql = "SELECT * FROM imp_info;";
        String query = "UPDATE imp_info SET gender = 'F' WHERE name = 'Sibu'; ";

        try {
            Connection con = DriverManager.getConnection(url, "postgres", "1234");
            System.out.println("connection established !");

            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(sql);

            while (r.next()) {
                System.out.print("id : "+r.getInt("id") + " ,");
                System.out.print("Name : "+r.getString("name") + " ,");
                System.out.println("gender : "+r.getString("gender"));

            }

//            st.execute(query);

            con.close();
            System.out.println("Connection is closed now !");

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Something went wrong !");
        }
    }
}
