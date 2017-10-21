package com.mazurnata.practice.module07.composition;

public class Soap {
    private String s;

    public Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}
