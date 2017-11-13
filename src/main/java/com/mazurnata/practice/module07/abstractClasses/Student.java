package com.mazurnata.practice.module07.abstractClasses;

public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
