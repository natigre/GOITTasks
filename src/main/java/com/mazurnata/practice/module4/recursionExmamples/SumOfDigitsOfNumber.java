package com.mazurnata.practice.module4.recursionExmamples;
/*
Дано натуральное число N. Вычислите сумму его цифр.
При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).

 */
public class SumOfDigitsOfNumber {
    public static int recursion(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recursion(n / 10);
        }
    }

}
