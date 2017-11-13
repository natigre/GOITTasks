package com.mazurnata.practice.module07.inharitance.constructorswitharguments;

public class Chess extends BoardGame {
    public Chess(int i) {
        super(i);
        System.out.println("Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess(11);
        System.out.println(x);
    }
}
