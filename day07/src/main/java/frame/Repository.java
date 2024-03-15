package frame;

import exception.DuplicatedIdException;
import exception.NotFoundIdException;

import java.sql.Connection;
import java.util.List;

public interface Repository<K, V> {
    // 행 삽입
    V insert(V v, Connection con) throws DuplicatedIdException, Exception;
    // 기존 값 업데이트
    V update(V v, Connection con) throws NotFoundIdException, Exception;
    // 행 삭제
    Boolean delete(K k, Connection con) throws NotFoundIdException, Exception;
    // 전체 리스트 조회
    List<V> select(Connection con) throws Exception;
    // 특정 행 조회
    V select(K k, Connection con) throws NotFoundIdException, Exception;
}
