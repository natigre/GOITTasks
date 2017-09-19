package com.mazurnata.practice.module3;

public class IfElseWithReturn {
    private static int test1(int testval, int target) {
        if (testval > target) {
            return +1;
        } else if (testval < target) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(test1(10,5));
        System.out.println(test1(5,10));
        System.out.println(test1(5,5));
    }
}
