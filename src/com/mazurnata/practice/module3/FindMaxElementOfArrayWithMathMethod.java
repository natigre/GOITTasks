package com.mazurnata.practice.module3;

public class FindMaxElementOfArrayWithMathMethod {
    public static void main(String[] args) {
        // Нахождение максимального элемента в массиве myArray из 4 элементов типа double.
        double[] myArray = {11, 5.8, 11.1, 10.9};

        // Переменной max задаем минимальное double-значение.
        double max = Double.MIN_VALUE;

        // Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++) {
            // Переменной max с помощью метода Math.max() присваиваем максимальное значение
            // путем выбора наибольшего из двух значений ("старого" значения max и значения элемента).
            max = Math.max(max, myArray[i]);
        }

        // Выводим на экран наибольшее число массива myArray.
        System.out.println("Максимальный элемент в массиве myArray: " + max);
    }
}