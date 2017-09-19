package com.mazurnata.practice.module2;

public class TestInstanceOfExample {
    public static void main(String[] args) {
        String name = "Олег";
        // Следующее вернётся верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println(result);
    }
}
