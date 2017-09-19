package com.mazurnata.hometasks.module03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHolder {
    Scanner scanner = new Scanner(System.in);
    int[] arrayInt;
    int count = 0;


    public void start() {

        System.out.println("Hello! Please enter the size of the array!");
        addSizeAndFillArray();
        findMinElementOfArray(arrayInt);
        findMaxElementOfArray(arrayInt);
        countTheNumberFive(arrayInt);
        sortArray(arrayInt);

    }

    public void addSizeAndFillArray() {
        int size = scanner.nextInt();
        arrayInt = new int[size];
        count = 0;
        if (count < size) {
            for (; count < arrayInt.length; count++) {
                System.out.print("Enter number " + (count + 1) + ": ");
                arrayInt[count] = scanner.nextInt();
            }
        } else {
            System.out.println("This is not number. Please try again.");
        }
        System.out.print("Array is: ");
        for (int array : arrayInt) {
            System.out.print(array + " ");
        }
        System.out.println();
    }

    private void findMinElementOfArray(int[] arrayInt) {
        System.out.println("Let's find min element of arrayInt.");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayInt.length; i++) {
            min = Math.min(min, arrayInt[i]);
        }
        System.out.println("Min element in arrayInt: " + min);
    }

    private void findMaxElementOfArray(int[] arrayInt) {
        System.out.println("Now let's find max element of arrayInt.");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrayInt.length; i++) {
            max = Math.max(max, arrayInt[i]);
        }
        System.out.println("Max element in arrayInt: " + max);
    }

    private int countTheNumberFive(int[] arrayInt) {
        System.out.println("Let's count the number of repetitions of the number 5");
        int countRepeat = 0;

        for (int element : arrayInt) {
            if (element == 5) {
                countRepeat++;
            }
        }
        System.out.println("Count the number of 5 is: " + countRepeat);
        return countRepeat;
    }

    private void sortArray(int[] arrayInt) {
        Arrays.sort(arrayInt);
        System.out.println("Sorted array:" + Arrays.toString(arrayInt));
    }
}
