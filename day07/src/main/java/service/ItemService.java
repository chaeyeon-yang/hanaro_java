package service;

import data.ItemDto;
import exception.DuplicatedIdException;
import exception.NotFoundIdException;
import frame.ConnectionPool;
import frame.Service;
import repository.ItemRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ItemService implements Service<String, ItemDto> {
    ItemRepository repository;
    ConnectionPool cp;

    public ItemService() {
        repository = new ItemRepository();
        try {
            cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ItemDto add(ItemDto itemDto) throws DuplicatedIdException, Exception {
        Connection con = cp.getConnection();
        try {
            con.setAutoCommit(false);
            repository.insert(itemDto, con);
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
    public ItemDto modify(ItemDto itemDto) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public Boolean remove(String s) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public List<ItemDto> get() throws Exception {
        return null;
    }

    @Override
    public ItemDto get(String s) throws NotFoundIdException, Exception {
        return null;
    }
}
