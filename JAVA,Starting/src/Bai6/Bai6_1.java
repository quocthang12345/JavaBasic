package Bai6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bai6_1 {
    public static void main(String[] args) {
        System.out.println("TienHanhConnect");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/data";
            String user = "root";
            String password = "123456";
            Connection conn = DriverManager.getConnection(url,user, password);
            Statement stmt = conn.createStatement();
            String sql = "select * from table1";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                int id=rs.getInt("Id");
                int tong=rs.getInt("Total");
                String name=rs.getString("Name");
                String dc=rs.getString("Address");
                System.out.println("ID= "+id+" Name= "+name+" Address= "+dc+" Total = "+tong);
            }
            rs.close();
            stmt.close();
        }
        catch(Exception e){  System.out.println("Error " + e); }
    }
}