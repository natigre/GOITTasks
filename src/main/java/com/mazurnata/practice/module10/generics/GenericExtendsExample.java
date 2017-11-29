package com.mazurnata.practice.module10.generics;

import com.mazurnata.practice.module10.enumExample.User;

import java.util.ArrayList;

public class GenericExtendsExample {
    public static void main(String[] args) {
//        Data<User> wrongData = new Data<>();//получим compilationError
        Data<ArrayList<User>> rightData = new Data<>();
    }
}
