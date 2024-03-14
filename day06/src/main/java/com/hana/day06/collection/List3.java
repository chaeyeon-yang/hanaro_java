package com.hana.day06.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        List<UserDto> list = new ArrayList<>();
        list.add(new UserDto("id01","pwd01",0,"dowoon",0, LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id02","pwd01",0,"wonpil",0, LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id03","pwd01",0,"sungjin",0, LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id04","pwd01",0,"younghyun",0, LocalDate.parse("2024-03-14")));


        System.out.println(list);
        list.forEach((c)-> System.out.println(c));

        // id02 삭제
        for (UserDto u:list) {
            if (u.getId().equals("id02")) {
                list.remove(u);
                break;
            }
        }

        System.out.println();

        // id02의 이름을 영현이로 수정
        for (UserDto u:list) {
            if (u.getId().equals("id02")) {
                u.setName("영현이");
                break;
            }
        }

        // id02의 정보를 조회하라
        for (UserDto u:list) {
            if (u.getId().equals("id02")){
                System.out.println(u);
            }
        }

        System.out.println("-----------------------------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일");

        for (UserDto c: list) {
            System.out.printf("고객정보: %s %d %d원 %s %n",c.getId(), c.getAge(), c.getMoney());
        }



    }
}
