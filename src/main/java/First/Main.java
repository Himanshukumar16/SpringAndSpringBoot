package First;
import java.sql.*;
class Main{
    public static void main(String[] args) throws SQLException {
/*
    steps to connect :

    import package by java.sql.*;
    load and register
    create connection
    create statement
    execute statement
    process the result
    close by con.close();
*/

//  load and register :->

        /* this became optional after java 6.
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Successful executed !");
        } catch (ClassNotFoundException e) {
            System.out.println("There was an error !");
        }*/

//      for writing url :- javaConnectigToWhat:JDBC_WillConnectWith://portNumberOf_DBMS_Using/DatabaseName

        String url = "jdbc:mysql://localhost:3306/practice";// for postgresql portnumber is 5432 for mysql portnumber is 3306.
        String user = "root";
        String pass = "1234";

        Connection con;
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection established");

        Statement st = con.createStatement();

//        ResultSet res = st.executeQuery("select salary from salary where id < 106;");
//        res.next();
//      System.out.println(res.getString("name")); //prints only first record.
//
//        while(res.next()){
//            System.out.println(res.getString("salary"));
//        }



    }
}
