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

        //task 3 part 2
        findMaxCountRepeat(arrayInt);
        findMinCountRepeat(arrayInt);

        //task 3 part 3
        readingArrayWithoutFixedLength();
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

    private void countTheNumberFive(int[] arrayInt) {
        System.out.println("Let's count the number of repetitions of the number 5");
        int countRepeat = 0;

        for (int element : arrayInt) {
            if (element == 5) {
                countRepeat++;
            }
        }
        System.out.println("Count the number of 5 is: " + countRepeat);
    }

    private void sortArray(int[] arrayInt) {
        Arrays.sort(arrayInt);
        System.out.println("Sorted array:" + Arrays.toString(arrayInt));
        System.out.println();
    }

    //task 3 part 2
    private static void findMaxCountRepeat(int[] arrayInt) {
        int maxRepeat = 0;
        int repeatElement;
        for (int element : arrayInt) {
            repeatElement = 0;
            for (int i = 0; i < arrayInt.length; i++) {
                if (element == arrayInt[i]) {
                    repeatElement++;
                }
            }
            if (repeatElement > 1) {
                if (repeatElement > maxRepeat) {
                    maxRepeat = repeatElement;
                }
            }
        }
        System.out.println("Max number of repetitions of numbers in an array: " + maxRepeat);
    }

    public static void findMinCountRepeat(int[] arrayInt) {
        int minRepeat = 0;
        int repeatElement;
        for (int element : arrayInt) {
            repeatElement = 0;
            for (int i = 0; i < arrayInt.length; i++) {
                if (element == arrayInt[i]) {
                    repeatElement++;
                }
            }
            if (repeatElement > 1) {
                if (minRepeat == 0) {
                    minRepeat = repeatElement;
                } else if (minRepeat > repeatElement) {
                    minRepeat = repeatElement;
                }
            }
        }
        System.out.println("Min number of repetitions of numbers in an array: " + minRepeat);
        System.out.println();
    }

    //task 3 part 3
    private void readingArrayWithoutFixedLength() {
        System.out.println("Please enter the size of the new array:");
        int[] array = new int[scanner.nextInt()];
        int count = 0;
        for (int i = 0; i <array.length ; i++) {
            System.out.print("Enter number " + (count + 1) + ": ");
            array[count] = Integer.parseInt(scanner.next());
            count++;
        }
        System.out.println();
        System.out.println("New array:" + Arrays.toString(array));
    }

}
