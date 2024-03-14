package com.hana.day06.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class List4 {
    public static void main(String[] args) {
        Set<String> setData = new HashSet<>();
        setData.add("A");
        setData.add("C");
        setData.add("B");
        setData.add("C");
        setData.add("A");
        System.out.println(setData);

        // 1-100 까지의 랜덤한 정수 수자를 중복없이 10개 발생시켜라
        Random random = new Random();

        Set<Integer> randomSet = new HashSet<>();
        while(randomSet.size()<10) {
            randomSet.add(random.nextInt(100)+1);
        }
        System.out.println();
        randomSet.stream();

    }
}
