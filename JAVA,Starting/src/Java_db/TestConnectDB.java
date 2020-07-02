package Java_db;
// package connect_db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnectDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Travel";// your db name
            String user=""; // your db username
            String password=""; // your db password
//            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
//                    "databaseName=Travel;username="";password="";";
            Connection conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Connect success!");
            }

            var sql = "select * from dbo.Items";
            var statement = conn.prepareStatement(sql);
            var resultSet = statement.executeQuery();
            showResutl(resultSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void showResutl(ResultSet resultSet) throws SQLException {
        System.out.printf("%-6s%-20s%-15s%-30s%-20s%-10s%-20s%-6s\n", "ItemID",
                "NameItem", "InfoItem", "Image",
                "NumberOfOrder", "RealPrice", "Discount","TotalPrice");
        while (resultSet.next()){
            var ItemID = resultSet.getInt("ItemID");
            var NameItem = resultSet.getString("NameItem");
            var InfoItem = resultSet.getString("InfoItem");
            var image = resultSet.getString("Image");
            var numberOfOrder = resultSet.getDate("NumberOfOrder");
            var realPrice = resultSet.getString("RealPrice");
            var discount = resultSet.getString("Discount");
            var totalPrice = resultSet.getString("TotalPrice");

            System.out.printf("%-6d%-20s%-15s%-30s%-20s%-10s%-20s%-6s\n", ItemID, NameItem,
                    InfoItem, image, numberOfOrder, realPrice, discount,totalPrice);
        }
    }
}