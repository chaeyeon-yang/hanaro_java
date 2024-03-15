package service;

import data.CustDto;
import exception.DuplicatedIdException;
import exception.NotFoundIdException;
import frame.ConnectionPool;
import frame.Service;
import repository.CustRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustService implements Service<String, CustDto> {

    CustRepository repository;
    ConnectionPool cp;

    public CustService(){
        repository = new CustRepository();
        try {
            cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public CustDto add(CustDto custDto) throws DuplicatedIdException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false);
            repository.insert(custDto, con);
            con.commit();
        }catch(Exception e){
            con.rollback();
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public CustDto modify(CustDto custDto) throws NotFoundIdException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false);
            repository.update(custDto, con);
            con.commit();
        }catch(Exception e){
            System.out.println("에러에러");
            con.rollback();
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public Boolean remove(String s) throws NotFoundIdException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false);
            repository.delete(s, con);
            con.commit();
        }catch(Exception e){
            System.out.println("에러에러");
            con.rollback();
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public List<CustDto> get() throws Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false);
            repository.select(con);
            con.commit();
        }catch(Exception e){
            System.out.println("에러에러");
            con.rollback();
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }

    @Override
    public CustDto get(String s) throws NotFoundIdException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false);
            repository.select(s, con);
            con.commit();
        }catch(Exception e){
            System.out.println("에러에러");
            con.rollback();
            throw e;
        }finally {
            cp.releaseConnection(con);
        }
        return null;
    }
}
