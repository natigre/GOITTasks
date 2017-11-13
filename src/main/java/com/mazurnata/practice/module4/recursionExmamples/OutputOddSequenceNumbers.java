package com.mazurnata.practice.module4.recursionExmamples;

import java.util.Scanner;

/*
Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
Выведите все нечетные числа из этой последовательности, сохраняя их порядок.
В этой задаче нельзя использовать глобальные переменные и передавать какие-либо параметры
в рекурсивную функцию. Функция получает данные, считывая их с клавиатуры. Функция не возвращает значение,
а сразу же выводит результат на экран. Основная программа должна состоять только из вызова этой функции.
 */
public class OutputOddSequenceNumbers {
    public static void recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                recursion();
            } else {
                recursion();
            }
        } if (n == 0) {
            return;
        }
    }

    public static void main(String[] args) {
        recursion();
    }
}
