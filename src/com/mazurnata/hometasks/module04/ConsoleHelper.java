package com.mazurnata.hometasks.module04;

import java.util.Scanner;

public class ConsoleHelper {

    Scanner scanner = new Scanner(System.in);

    public void start() {
        int result;

        System.out.println("Hello! Do your choice, please!");
        result = scanner.nextInt();
        do {
            System.out.println(" 1. Reading a number from 1 to X");
            System.out.println(" 2. Reading a number from 1 to X using recursion");
            System.out.println(" 3. Draw a rectangle with signs '+'. Size you set yourself");
            System.out.println(" 4. Draw a square with signs '+'. Size you set yourself");
            System.out.println(" 5. Draw a rectangle using recursion");
            System.out.println(" 6. Compare two numbers (int or float) and find out which one is bigger");
            System.out.println(" 0. Exit the program");
        } while (result < 0 || result > 6);
        System.out.println();

        switch (result) {
            case 1:

                break;
            case 2:
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

        }
    }
}
