package com.mazurnata.practice.module4.recursionExmamples;

import java.util.Scanner;

public class test {
    static Scanner scanner = new Scanner(System.in);

    public static String recursion(int n) {

        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(n - 1) + " " + n;
    }

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        System.out.println(recursion(n)); // вызов рекурсивной функции
//        drawRectangleRecursia(3, 3);
        drawRectangleWithRecursion(3, 3, 0, 0);
        if ("apple".trim() == "apple".trim()) {
            System.out.println("ok");
        }
        System.out.println(12 >>> 1);
        System.out.println(12 >> 1);
        System.out.println(128 >> 2);
    }

    public static void drawRectangleRecursia(int x, int y) {

        //Перегрузить функцию drawRectangle (задание 2) таким образом, что бы она могла принимать на вход только
        // 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами

        if ((x == 0) && (y == 1)) return; //
        int iRecursia = 0;
        if (x != 0) { // рухаємось по рядку поки не добігаєм його кінця
            iRecursia++; // збільшуєм лічильник пройдених символів у рядку (в кінці зрівнюється з шириною рядка)
            System.out.print("x ");
            drawRectangleRecursia(x - 1, y); // пересуваємось на 1 позицію в рядку
        } else { // інакше (при досягненні кінця рядка) перескакуєм на наступний рядок
            System.out.println(); // перескакуєм на наступний рядок
            x = iRecursia; // зберігаєм ширину рядка для майбутнього проходження
            iRecursia = 0; // обнуляємо лічильник пройдених символів у рядку
            drawRectangleRecursia(x, y - 1); // зменшуєм кількість рядків на 1
        }
    }

    private static void drawRectangleWithRecursion( int width, int height,  int wCount, int hCount) {
        if (height > hCount && width > wCount) {
            System.out.print("+ ");
            drawRectangleWithRecursion(width, height, wCount,hCount + 1);

        }
        if (width > wCount && height == hCount) {
            System.out.println("");
            drawRectangleWithRecursion(width, height,  wCount + 1, 0);
        }
    }
}

