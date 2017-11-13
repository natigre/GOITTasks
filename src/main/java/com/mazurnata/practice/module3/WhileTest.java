package com.mazurnata.practice.module3;
/*
генерирует случайные числа до тех пор,
пока не будет ввыполнено определенное условие
 */
public class WhileTest {
    public static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside 'While' ");
        }
        System.out.println("Exited 'While'");
    }
}
