package com.mazurnata.practice.module10;

import com.alibaba.fastjson.JSON;
import com.mazurnata.practice.module10.enumExample.Gender;
import com.mazurnata.practice.module10.enumExample.User;

public class JSONExample {

    static void simpleExample() {
        System.out.println("simple example: ");
        User user = new User("Petya", Gender.male, 35);

        //обьект превращаем в JSON
        String json = JSON.toJSONString(user);
        System.out.println(json);
        System.out.println();
    }

    static void groupExample() {
        System.out.println("group example: ");

        UserGroup group = new UserGroup();
        group.name = "Class A";
        group.users.add(new User("Petya", Gender.male, 35));
        group.users.add(new User("Alex", Gender.male, 20));
        group.users.add(new User("Irina", Gender.female, 27));
        group.users.add(new User("X", Gender.unknown, 0));


        //серелизация группы в JSON, получаем массив
//        String json = JSON.toJSONString(group);
        String json = JSON.toJSONString(group.users);
        System.out.println(json);
        System.out.println();
    }

    static void userReadExample() {
        System.out.println("read User from JSON example: ");

        String json = "";

        User user = JSON.parseObject("", User.class);
        System.out.println(json);
        System.out.println();
    }

    public static void main(String[] args) {
        simpleExample();
        groupExample();
    }
}
