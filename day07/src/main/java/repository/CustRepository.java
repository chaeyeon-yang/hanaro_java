package repository;

import data.CustDto;
import exception.DuplicatedIdException;
import exception.NotFoundIdException;
import frame.ConnectionPool;
import frame.Repository;
import frame.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class CustRepository implements Repository<String, CustDto> {

    ConnectionPool cp;

    public CustRepository() {
        try {
            cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CustDto insert(CustDto custDto) throws DuplicatedIdException, Exception{
        // 1. Driver Loading
        // -----> collection poll 이 해줌

        // 2. Connection
        Connection con = null;
        con = cp.getConnection();

        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQL.insertCust);
            // 3. SQL --> /frame/SQL 에 있음
            // 4. PreparedStatement
            pstmt.setString(1, custDto.getId());
            pstmt.setString(2, custDto.getPwd());
            pstmt.setString(3, custDto.getName());
            pstmt.executeUpdate();
        }catch (SQLIntegrityConstraintViolationException e) {
            throw new DuplicatedIdException("아이디 중복 -- ERR0001");
        }catch (SQLException e) {
            throw new Exception("시스템 장애 -- EXX0001");
        } finally{
            // 5. Close
            if (pstmt != null) {
                pstmt.close();
            }
            cp.releaseConnection(con);
        }
        return custDto;
    }

    @Override
    public CustDto update(CustDto custDto) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public Boolean delete(String s) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public List<CustDto> select() throws Exception {
        return null;
    }

    @Override
    public CustDto select(String s) throws NotFoundIdException, Exception {
        return null;
    }
}
