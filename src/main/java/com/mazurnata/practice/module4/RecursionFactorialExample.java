package com.mazurnata.practice.module4;

public class RecursionFactorialExample {
    public static void main(String[] args) {
        System.out.println(factorial(5));
//        System.out.println(factorial1(5));

    }

    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
//    static int factorial1(int x) {
//        int result = 1;
//        for (int i = 1; i <= x ; i++) {
//            result *= i;
//        }
//        return result;
//    }
}
