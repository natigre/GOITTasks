package com.mazurnata.practice.module4.practiceOff;

public class Task03AnotherExample {

    //with recursion
    private static void writeNumbersBetween1(int a, int b) {
        int maxNum = (a <= b) ? b : a;
        int minNum = (maxNum == b) ? a : b;
        recursionWriteNumberBetween(minNum, maxNum);
        System.out.println();
    }

    private static void recursionWriteNumberBetween(int minNum, int maxNum) {
        if (minNum <= maxNum) {
            System.out.print(minNum + " ");
            recursionWriteNumberBetween(minNum + 1, maxNum);
        }
    }

    //without recursion
    private static void writeNumbersBetween2(int a, int b) {
        if (a == b) {
            System.out.println(a);
            return;
        }
        int maxNum = (a <= b) ? b : a;
        int minNum = (maxNum == b) ? a : b;
        if (minNum <= maxNum) {
            System.out.print(minNum + " ");
            writeNumbersBetween2(minNum + 1, maxNum);
        }
    }

    public static void main(String[] args) {
        // Вариант решения №1
        writeNumbersBetween1(2, 5);
        writeNumbersBetween1(7, 7);
        writeNumbersBetween1(7, -13);

        // Вариант решения №2
        writeNumbersBetween2(2, 5);
        writeNumbersBetween2(7, 7);
        writeNumbersBetween2(7, -13);

    }
}
