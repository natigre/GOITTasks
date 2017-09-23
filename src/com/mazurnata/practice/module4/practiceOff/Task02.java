package com.mazurnata.practice.module4.practiceOff;

/*
Написать рекурсивную функцию возведения числа-Х в степень-N. Нельзя использовать циклы.

 */
public class Task02 {

    public static int powerRecursive(int x, int power) {
        int result;
        if (power == 0) return 1;
        result = x * powerRecursive(x, power - 1);
        return result;
    }

    private static int power(int x, int n) {
        if (n == 1) return x;
        return power(x, n - 1) * x;
    }

    public static void main(String[] args) {
        System.out.println("power = " + power(2, 3));
        System.out.println("Check power= " + Math.pow(2, 3));
        System.out.println(powerRecursive(2,3));

    }
}
