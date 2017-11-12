package com.mazurnata.practice.module09.util;

public class Person {
    private static int counter = 1;

    public String name;

    public static void refreshCounter() {
        counter = 1;
    }

    public Person() {
        this.name = "" + counter++;
        System.out.println("Came person " + name);
    }
}
