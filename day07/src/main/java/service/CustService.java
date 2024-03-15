package service;

import data.CustDto;
import exception.DuplicatedIdException;
import exception.NotFoundIdException;
import frame.Service;
import lombok.RequiredArgsConstructor;
import repository.CustRepository;

import java.util.List;

public class CustService implements Service<String, CustDto> {

    CustRepository repository;

    public CustService() {
        repository = new CustRepository();
    }
    @Override
    public CustDto add(CustDto custDto) throws DuplicatedIdException, Exception {
        repository.insert(custDto);
        repository.insert(custDto);

        return null;
    }

    @Override
    public CustDto modify(CustDto custDto) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public Boolean remove(String s) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public List<CustDto> get() throws Exception {
        return null;
    }

    @Override
    public CustDto get(String s) throws NotFoundIdException, Exception {
        return null;
    }
}
