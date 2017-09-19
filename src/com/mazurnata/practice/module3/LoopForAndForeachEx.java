package com.mazurnata.practice.module3;

public class LoopForAndForeachEx {
    public static void main(String[] args) {

        // for

        //цикл с обратным отсчетом шагов
        for (int i = 10; i > 0; i--) {
            System.out.println("Counting down..." + i);
            System.out.println("Blastoff!");
        }

        for (int i = 1; i < 9; i++) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }

        int i = 1;
        for (; i < 9; ) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
            i++;
        }
        //changes elements of array
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i1 = 0; i1 < array.length; i1++) {
            array[i1] = array[i1] * 2;
            System.out.println(array[i1]);
        }

        //foreach
        int[] ints = new int[]{1, 2, 3, 4, 5};
        for (int j : ints) {

            System.out.println(j);
        }
        someAnotheExampleOfForeach();
    }

    private static void someAnotheExampleOfForeach() {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.print("\n");
        String[] names = {"Олег", "Иван", "Дима", "Юля"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(", ");
        }
    }
}
