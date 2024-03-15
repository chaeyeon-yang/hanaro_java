package repository;

import data.CustDto;
import exception.DuplicatedIdException;
import exception.NotFoundIdException;
import frame.Repository;
import frame.SQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustRepository implements Repository<String, CustDto> {

    @Override
    public CustDto insert(CustDto custDto, Connection con) throws DuplicatedIdException, Exception {
        // 4. PreparedStatement
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.insertCust);
            pstmt.setString(1, custDto.getId());
            pstmt.setString(2, custDto.getPwd());
            pstmt.setString(3, custDto.getName());
            pstmt.executeUpdate();
        }catch(SQLIntegrityConstraintViolationException e){
            throw new DuplicatedIdException("ERR0001");
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0001");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        return custDto;
    }

    @Override
    public CustDto update(CustDto custDto, Connection con) throws NotFoundIdException, Exception {
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.updateCust);
            pstmt.setString(1, custDto.getId());
            pstmt.setString(2, custDto.getPwd());

            pstmt.executeUpdate();
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0001");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        return custDto;
    }

    @Override
    public Boolean delete(String s, Connection con) throws NotFoundIdException, Exception {
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.deleteCust);
            pstmt.setString(1, s);

            pstmt.executeUpdate();
            return true;
        }catch(SQLIntegrityConstraintViolationException e){
            throw new DuplicatedIdException("ERR0001");
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0001");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public List<CustDto> select(Connection con) throws Exception {
        // CustDto 객체를 저장할 리스트 생성
        List<CustDto> custList = new ArrayList<>();

        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(SQL.selectAllCust); // 모든 고객 정보를 조회하는 SQL문
            rs = pstmt.executeQuery(); // 쿼리 실행

            // ResultSet에서 결과를 읽어와서 CustDto 객체를 생성하여 리스트에 추가
            while (rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                CustDto custDto = CustDto.builder()
                        .id(id)
                        .pwd(pwd)
                        .name(name)
                        .build();
                custList.add(custDto);
            }
        } catch (SQLException e) {
            throw new Exception("EXX0001");
        } finally {
            // ResultSet, PreparedStatement를 닫아주어야 함
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return custList; // 조회된 CustDto 객체의 리스트 반환

    }

    @Override
    public CustDto select(String s, Connection con) throws NotFoundIdException, Exception {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        CustDto custDto = null; // 반환할 CustDto 객체
        try{
            pstmt = con.prepareStatement(SQL.selectCust);
            pstmt.setString(1, s);

            rs = pstmt.executeQuery(); // 쿼리 실행하여 결과를 ResultSet에 저장

            if (rs.next()) { // 결과가 있을 경우에만 실행
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                custDto = CustDto.builder()
                        .id(id)
                        .pwd(pwd)
                        .name(name)
                        .build();
            } else { // 결과가 없을 경우 NotFoundIdException을 던짐
                throw new NotFoundIdException("ID " + s + "에 해당하는 데이터가 없습니다.");
            }
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0001");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custDto;
    }
}
