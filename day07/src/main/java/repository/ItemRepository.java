package repository;

import data.ItemDto;
import exception.DuplicatedIdException;
import exception.NotFoundIdException;
import frame.Repository;
import frame.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class ItemRepository implements Repository<String, ItemDto> {
    @Override
    public ItemDto insert(ItemDto itemDto, Connection con) throws DuplicatedIdException, Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(SQL.insertItem);
            pstmt.setString(1, itemDto.getName());
            pstmt.setString(2, String.valueOf(itemDto.getPrice()));
            pstmt.executeUpdate();
        } catch(SQLException e) {
            throw new Exception("시스템 에러");
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return itemDto;
    }

    @Override
    public ItemDto update(ItemDto itemDto, Connection con) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public Boolean delete(String s, Connection con) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public List<ItemDto> select(Connection con) throws Exception {
        return null;
    }

    @Override
    public ItemDto select(String s, Connection con) throws NotFoundIdException, Exception {
        return null;
    }
}
