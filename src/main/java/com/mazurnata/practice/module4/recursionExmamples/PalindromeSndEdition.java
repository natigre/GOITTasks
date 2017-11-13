package com.mazurnata.practice.module4.recursionExmamples;

public class PalindromeSndEdition {
    private static boolean recursion(String s) {
        char firstChar;
        char lastChar;
        int size = s.length();
        String subString;

        // Базовый случай
        if (size <= 1) {
            return true;
        } else {
            firstChar = s.toCharArray()[0];
            lastChar = s.toCharArray()[size - 1];
            subString = s.substring(1, size - 1);
            // Шаг рекурсии / рекурсивное условие
            return firstChar == lastChar && recursion(subString);
        }
    }

    public static void main(String[] args) {
        // вызов рекурсивной функции
        if (recursion("radar")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
