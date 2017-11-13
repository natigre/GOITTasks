package com.mazurnata.practice.module3;

public class BerylliumShpere {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Sphere " + id;
    }
}
