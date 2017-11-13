package com.mazurnata.practice.module3;

public class FindMaxElementOfArrayWithoutMeth {
    public static void main(String[] args) {
        // Нахождение максимального элемента в массиве myArray из 4 элементов типа double.
        double[] myArray = {11, 5.8, 11.1, 10.9};

        // Переменной max задаем минимальное double-значение.
        double max = myArray[0];

        // Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++) {
            // Сравниваем значение переменной max со значениями элемента массива.
            // Если значение элемента массива больше значения переменной max,
            // то новое значение переменной max будет равно значению этого элемента.
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        // Выводим на экран наибольшее число массива myArray.
        System.out.println("Максимальный элемент в массиве myArray: " + max);
    }
}
