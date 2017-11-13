package com.mazurnata.practice.module4.recursionExmamples;
/*
Дано натуральное число N. Выведите все его цифры по одной,
 в обычном порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки, массивы
(ну и циклы, разумеется). Разрешена только рекурсия и целочисленная арифметика.
 */
public class NumbersFromLeftToRight {
    private static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return recursion(n / 10) + " " + n % 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(1548));
    }
}
