package com.mazurnata.practice.module4.recursionExmamples;

/*
Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом. Выведите
YES или NO. При решении этой задачи нельзя пользоваться циклами, в решениях на питоне нельзя
использовать срезы с шагом, отличным от 1.
 */
public class Palindrome {
    private static String recursion(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                // Базовый случай
                if (s.length() == 2) {
                    return "YES";
                }
                // Шаг рекурсии / рекурсивное условие
                return recursion(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(recursion("mama Mia"));
        System.out.println(recursion("kak"));
    }
}
