package frame;

import exception.DuplicatedIdException;
import exception.NotFoundIdException;

import java.sql.Connection;
import java.util.List;

public interface Repository<K, V> {
    V insert(V v, Connection con) throws DuplicatedIdException, Exception;
    V update(V v, Connection con) throws NotFoundIdException, Exception;
    Boolean delete(K k, Connection con) throws NotFoundIdException, Exception;
    List<V> select(Connection con) throws Exception;
    V select(K k, Connection con) throws NotFoundIdException, Exception;
}
