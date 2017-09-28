package com.mazurnata.practice.module4.recursionExmamples;
/*
Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
 в порядке возрастания, если A < B, или в порядке убывания в противном случае.
 */
public class OderingOfNumbers {
    public static String recursion(int a, int b) {
        // основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a + 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(10, 20));
        System.out.println(recursion(15, 10));
    }
}
