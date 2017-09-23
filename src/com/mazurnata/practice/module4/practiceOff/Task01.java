package com.mazurnata.practice.module4.practiceOff;

import java.util.Arrays;

/*
Написать функцию - findMaxIndex которая принимает на вход массив чисел и возвращает индекс максимального числа.

Написать функцию - findMaxNumber которая принимает на вход массив чисел и возвращает максимальное число, используя первую функцию - findMaxIndex.

++
Перегрузить findMaxIndex и findMaxNumber для работы с int и float

 */
public class Task01 {
    //array Array of Integers.
    //Index of maximum number.
    public static int findMaxIndex(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    //array Array of Floats.
    //Index of maximum number.
    public static int findMaxIndex(float[] array) {
        float max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    //return Maximum number member of array.
    public static int findMaxNumber(int[] array) {
        return array[findMaxIndex(array)];
    }

    //return Maximum number member of array.
    public static float findMaxNumber(float[] array) {
        return array[findMaxIndex(array)];
    }

    public static void main(String[] args) {
        int[] arrayInt = {23, 221, 2, 54, -54, 45, -12, 0, 99};
        float[] arrayFloat = {43.5f, 214.5f, 0f, -34.56f, 23.0f};

        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Maximum: " + findMaxNumber(arrayInt));

        System.out.println(Arrays.toString(arrayFloat));
        System.out.println("Maximum: " + findMaxNumber(arrayFloat));
    }

}




