package test;

import java.sql.*;

public class Test {

    public static void main(String[] args) throws Exception{
        String url = "jdbc:postgresql://localhost/postgres";
        String user = "postgres";
        String password = "1029";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            Statement s = conn.createStatement();
            String sql = "SELECT * FROM weather";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getInt(2));
                System.out.println(rs.getInt(3));
                System.out.println(rs.getDouble(4));
                System.out.println(rs.getString(5));


            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
