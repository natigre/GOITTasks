package com.mazurnata.practice.module3;

public class FindMinElementOfArrayWithMathMethod {
    public static void main(String[] args) {
        // Нахождение максимального элемента в массиве myArray из 4 элементов типа double.
        double[] myArray = {11, 5.8, 11.1, 10.9};

        // Переменной min задаем максимальное double-значение.
        double min = Double.MAX_VALUE;

        // Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++) {
            // Переменной min с помощью метода Math.min() присваиваем минимальное значение
            // путем выбора наибольшего из двух значений ("старого" значения min и значения элемента).
            min = Math.max(min, myArray[i]);
        }

        // Выводим на экран наибольшее число массива myArray.
        System.out.println("Минимальный элемент в массиве myArray: " + min);
    }
}