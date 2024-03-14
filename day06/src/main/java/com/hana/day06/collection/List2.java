package com.hana.day06.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<CustDto> list = new ArrayList<>();
        list.add(CustDto.builder().id("id01").pwd("pwd01").name("dowoon").age(30).money(20000).regdate(LocalDate.parse("2024-08-25")).build());
        list.add(CustDto.builder().id("id02").pwd("pwd02").name("wonpil").age(31).money(20000).regdate(LocalDate.parse("2024-04-28")).build());
        list.add(CustDto.builder().id("id03").pwd("pwd03").name("younghyun").age(32).money(20000).regdate(LocalDate.parse("2024-12-19")).build());
        list.add(CustDto.builder().id("id04").pwd("pwd04").name("sungjin").age(32).money(20000).regdate(LocalDate.parse("2024-01-12")).build());
        list.add(CustDto.builder().id("id05").pwd("pwd05").name("myday").age(24).money(20000).regdate(LocalDate.parse("2024-08-27")).build());

        list.forEach((c)-> System.out.println(c));

        System.out.println();
        for (CustDto c: list) {
            System.out.printf("고객정보: %s %d %d원 %s년 %s월 %s일 %n",c.getId(), c.getAge(), c.getMoney(),
                    c.getRegdate().getYear(),
                    c.getRegdate().getMonthValue(),
                    c.getRegdate().getDayOfMonth());

        }

        System.out.println("-----------------------------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일");

        for (CustDto c: list) {
            System.out.printf("고객정보: %s %d %d원 %s %n",c.getId(), c.getAge(), c.getMoney(),
                    c.getRegdate().format(formatter));
        }



    }
}
