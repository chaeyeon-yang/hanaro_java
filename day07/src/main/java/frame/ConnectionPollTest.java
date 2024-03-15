package frame;

import java.sql.SQLException;

public class ConnectionPollTest {
    public static <Connection> void main(String[] args) {
        try {
            ConnectionPool cp = ConnectionPool.create();
            System.out.println(cp.getSize()); // static 영역에서 최초의 한번만 실행
            ConnectionPool cp2 = ConnectionPool.create();
            System.out.println(cp2.getSize());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello world");
    }
}
