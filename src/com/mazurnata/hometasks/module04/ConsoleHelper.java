package com.mazurnata.hometasks.module04;

import java.util.Scanner;

public class ConsoleHelper {
    Scanner scanner = new Scanner(System.in);


    public void start() {
        int result;
        System.out.println("Hello! Do your choice, please!");
        System.out.println();
        do {
            System.out.println(" 1. Reading a number from 1 to X");
            System.out.println(" 2. Reading a number from 1 to X using recursion");
            System.out.println(" 3. Draw a rectangle with signs '+'. Size you set yourself");
            System.out.println(" 4. Draw a square with signs '+'. Size you set yourself");
            System.out.println(" 5. Draw a rectangle using recursion");
            System.out.println(" 6. Compare two numbers (int or float) and find out which one is bigger");
            System.out.println(" 0. Exit the program");

            result = scanner.nextInt();
            switch (result) {
                case 1:
                    getReadingNumber();
                    break;
                case 2:
                    System.out.print("Enter integer number: ");
                    int a = scanner.nextInt();
                    getReadingNumberWithRecursion(a);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Sorry, I didn't get that...");
            }

        } while (result < 0 || result > 6);
    }

    public void getReadingNumber() {
        System.out.print("Enter integer number: ");
        int a = scanner.nextInt();
        if (a > 0) {
            for (int i = 0; i < a; i++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        } else if (a == 0) {
            System.out.println("Oh, no. It's 0");
        } else {
            System.out.println("Sorry, that number is negative.");
        }
    }

    public void getReadingNumberWithRecursion(int a) {
        if (a > 0) {
            if (a == 1) System.out.print("1 ");
            else {
                getReadingNumberWithRecursion(a - 1);
                System.out.print(a + " ");
            }
        } else if (a == 0) {
            System.out.println("Oh, no. It's 0");
        } else {
            System.out.println("Sorry, that number is negative.");
        }
    }

    


}


