package com.mazurnata.practice.module3;

public class TernarnyExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int z = x < y ? (x + y) : (x - y);
        System.out.println(z);
    }
}
