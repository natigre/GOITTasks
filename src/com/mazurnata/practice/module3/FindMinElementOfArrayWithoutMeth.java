package com.mazurnata.practice.module3;

public class FindMinElementOfArrayWithoutMeth {
    public static void main(String[] args) {
        // Нахождение максимального элемента в массиве myArray из 4 элементов типа double.
        double[] myArray = {11, 5.8, 11.1, 10.9};

        // Переменной min задаем минимальное double-значение.
        double min = myArray[0];

        // Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++) {
            // Сравниваем значение переменной min со значениями элемента массива.
            // Если значение элемента массива больше значения переменной min,
            // то новое значение переменной min будет равно значению этого элемента.
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }

        // Выводим на экран наибольшее число массива myArray.
        System.out.println("Минимальный элемент в массиве myArray: " + min);
    }
}
