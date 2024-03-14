package com.hana.day06.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class MyDate2 {
    public static void main(String[] args) {
        Date date = new Date();
        // 특정 지역의 시간 가져오기
        LocalDate localDate = date.toInstant().atZone(ZoneId.of("Africa/Cairo")).toLocalDate();
        System.out.println(localDate);

        LocalDateTime localDataTime = date.toInstant().atZone(ZoneId.of("Africa/Cairo")).toLocalDateTime();
        System.out.println(localDataTime);

        // zoneid: https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
    }
}
