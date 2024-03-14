package com.hana.day06.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class MyData {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getYear());
        System.out.println(d.getMonth());

        System.out.println("----------------------------");

        LocalDate localNow = LocalDate.now();
        System.out.println(localNow);
        LocalDate localDate1 = LocalDate.of(2024,3,14);
        LocalDate localDate2 = LocalDate.parse("2024-03-14"); // 무조건 하이픈 형태, 10미만의 숫자의 경우 앞에 0을 붙여줘야 함
        System.out.println(localDate1);
        System.out.println(localDate2);


        System.out.println("----------------------------");
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2024,03,11,11,11,11);
        LocalTime localDateTime2 = LocalTime.of(11,11,11); // 시, 분, 초
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
