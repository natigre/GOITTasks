package com.mazurnata.practice.module10;

import com.mazurnata.practice.module10.enumExample.User;

import java.util.ArrayList;

public class UserGroup {
    public String name;
    public ArrayList<User> users = new ArrayList<>();

    public int getGroupSize() {
        return users.size();
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
