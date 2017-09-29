package com.mazurnata.practice.module4.recursionExmamples;
/*
Дано натуральное число n>1. Выведите все простые
множители этого числа в порядке неубывания с учетом кратности. Алгоритм должен иметь сложность O(logn).
 */
public class Factorization {
    private static void recursion(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        }  // Шаг рекурсии / рекурсивное условие
        else {
            recursion(n, ++k);
        }
    }

    public static void main(String[] args) {
        recursion(150, 2);
    }
}
