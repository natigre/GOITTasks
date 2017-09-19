package com.mazurnata.practice.module3;

public class InicializationArraysEx {
    public static void main(String[] args) {
        // Создание массивов myArrayInt1 и myArrayInt2 типа int и объявление переменных
        int[] myArrayInt1;
        int myArrayInt2[];

        // Определение массива или выделение памяти
        // Массив myArrayInt3 из 10 элементов с начальным значением 0 для каждого элемента
        int[] myArrayInt3;
        myArrayInt3 = new int[10];
        // Массив myArrayInt4 из 20 элементов с начальным значением 0 для каждого элемента
        int[] myArrayInt4 = new int[20];

        //Инициализация массива
        // Массив myArrayInt5 из 5 элементов со значениями элементов 1, 3, 8, 10, 4
        int[] myArrayInt5 = {1, 3, 8, 10, 4};
        // Массив myArrayInt6 из 10 элементов с начальным значением 0 для каждого элемента
        int[] myArrayInt6 = new int[10];
        // Присвоение второму элементу myArrayInt6 значения 14
        myArrayInt6[2] = 14;
        // Присвоение пятому элементу myArrayInt6 значения 8
        myArrayInt6[5] = 8;
    }
}
