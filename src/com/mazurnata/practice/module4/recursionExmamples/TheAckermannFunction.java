package com.mazurnata.practice.module4.recursionExmamples;
/*
В теории вычислимости важную роль играет функция Аккермана A(m,n), определенная следующим образом:

Даны два целых неотрицательных числа m и n, каждое в отдельной строке. Выведите A(m,n).
 */
public class TheAckermannFunction {
    public static int recursion(int m, int n) {
        if (m == 0) {
            return n + 1;
        } // Шаг рекурсии / рекурсивное условие
        if (n == 0 && m > 0) {
            return recursion(m- 1, 1);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return recursion(m - 1, recursion(m, n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(3, 2));
    }
}
