package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc3 {
    public static void main(String[] args) {
        // 1. Driver Loading
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //driver 존재하지 않으면 예외발생
            System.out.println("OK...");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found....");
        }
        // 2. Connection
        String url = "jdbc:mysql://localhost:3306/shopdb";
        String id = "root";
        String pwd = "asycy1101!";

        Connection con = null;
        try {
            con = DriverManager.getConnection(url, id, pwd);
            System.out.println("접속 성공");
        } catch (SQLException e) {
            System.out.println("접속 실패");
        }

        //3. SQL 구문 생성
        String insertSql = "UPDATE db_cust SET pwd = ?, name = ? WHERE id = ?";
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(insertSql);
            pstmt.setString(1,"pwd01");
            pstmt.setString(2,"윤도운이");
            pstmt.setString(3, "id01");

            // 전송
            pstmt.executeUpdate();
            System.out.println("Update ...");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error");
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
