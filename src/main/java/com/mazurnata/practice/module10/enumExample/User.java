package com.mazurnata.practice.module10.enumExample;

public class User {
    public String name;
    public Gender gender;
    public int age;


    public User(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
