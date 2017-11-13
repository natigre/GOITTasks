package com.mazurnata.practice.module4;

public class FibonachiExample {
    public static void main(String[] args) {
        System.out.println(fibonachi(6));
    }
    static int fibonachi(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return fibonachi(x - 1) + fibonachi(x - 2);
        }
    }
}
