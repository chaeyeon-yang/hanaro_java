package com.hana.day06.collection;

import java.time.LocalDate;

public class UserDto {
    private String id;
    private String pwd;
    private int age;
    private String name;
    private long money;
    private LocalDate regDate;

    public UserDto(String id, String pwd, int age, String name, long money, LocalDate regDate) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.name = name;
        this.money = money;
        this.regDate = regDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDto{");
        sb.append("id='").append(id).append('\'');
        sb.append(", pwd='").append(pwd).append('\'');
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", money=").append(money);
        sb.append(", regDate=").append(regDate);
        sb.append('}');
        return sb.toString();
    }
}
