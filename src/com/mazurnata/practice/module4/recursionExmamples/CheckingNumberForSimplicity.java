package com.mazurnata.practice.module4.recursionExmamples;

/*
Дано натуральное число n>1. Проверьте, является ли оно простым. Программа должна вывести слово YES,
если число простое и NO, если число составное. Алгоритм должен иметь сложность O(logn).
Указание. Понятно, что задача сама по себе нерекурсивна, т.к. проверка числа n на простоту никак
не сводится к проверке на простоту меньших чисел. Поэтому нужно сделать еще один параметр рекурсии: делитель числа, и именно по этому параметру и делать рекурсию.
 */
public class CheckingNumberForSimplicity {
    private static boolean recursion(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return false;
        }  // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(2, 5));
    }
}
