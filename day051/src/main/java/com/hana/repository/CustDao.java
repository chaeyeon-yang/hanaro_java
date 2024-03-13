package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class CustDao implements Dao<String, CustDto> {
    @Override
    public int insert(CustDto custDto) throws DuplicatedIdException {
        //System.out.println("Duplicated ID Exception ");
        if(custDto.getId().equals("id01")){
            throw new DuplicatedIdException("EX0001");
        }
        System.out.println("Oracle DB:Inserted ... "+custDto);
        return 0;
    }

    @Override
    public int delete(String s) throws  Exception{
        System.out.println("Oracle DB:Deleted ... "+s);
        return 0;
    }

    @Override
    public int update(CustDto custDto) throws IdNotFoundException{
        try {
            System.out.println("Oracle DB:Updated ... "+custDto);

        } catch (IdNotFoundException e) {
            System.out.println("Invalid access ...");
        }
        return 0;
    }

    @Override
    public CustDto select(String s) throws NotFoundException {
        try {
            return CustDto.builder().id(s).pwd("pwd01").name("james").build();
        } catch (NotFoundException e) {
            System.out.println("Invalid access ...");
            return 0;
        }
    }

    @Override
    public List<CustDto> select() throws  Exception{
        List list = new ArrayList<CustDto>();
        list.add(CustDto.builder().id("id01").pwd("pwd01").name("james").build());
        list.add(CustDto.builder().id("id02").pwd("pwd02").name("james").build());
        list.add(CustDto.builder().id("id03").pwd("pwd03").name("james").build());
        return list;
    }
}
