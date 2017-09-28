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
                    getCaseTwo();
                    break;
                case 3:
                    getCaseThree();
                    break;
                case 4:
                    getCaseFour();
                    break;
                case 5:
                    getCaseFive();
                    break;
                case 6:
                    getCaseSix();
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Sorry. Try again!");
            }

        } while (result < 0 || result > 6);
    }

    public void getReadingNumber() {
        System.out.print("Enter integer number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        } else if (number == 0) {
            System.out.println("Oh, no. It's 0");
        } else {
            System.out.println("Sorry, that number is negative.");
        }
    }

    public void getReadingNumberWithRecursion(int number) {
        if (number > 0) {
            if (number == 1) System.out.print("1 ");
            else {
                getReadingNumberWithRecursion(number - 1);
                System.out.print(number + " ");
            }
        } else if (number == 0) {
            System.out.println("Oh, no. It's 0");
        } else {
            System.out.println("Sorry, that number is negative.");
        }
    }

    public void getCaseTwo() {
        System.out.print("Enter integer number: ");
        int number = scanner.nextInt();
        getReadingNumberWithRecursion(number);
    }

    public static String drawRectangle(int width, int height) {
        String result = "";
        for (int i = 0; i < height; i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line += "+ ";
            }
            result += line + "\n";
        }
        System.out.println(result);
        return result;
    }

    public void getCaseThree() {
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        drawRectangle(width, height);
    }

    public static void drawSquare(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    public void getCaseFour() {
        System.out.print("Enter the side of square: ");
        int side = scanner.nextInt();
        drawSquare(side);
    }

    private static void drawRectangleWithRecursion(int height, int width) {
        if (height > 0 || width > 0) {
            if (width > 0) {
                System.out.print("+ ");
                drawRectangleWithRecursion(height, width - 1);
                return;
            }
            if (height > 1) {
                System.out.println();
                drawRectangleWithRecursion(height - 1, width);
            }
        }
    }

    public void getCaseFive() {
        System.out.print("Enter width: ");
        int widthR = scanner.nextInt();
        System.out.print("Enter height: ");
        int heightR = scanner.nextInt();
        drawRectangleWithRecursion(widthR, heightR);
    }

    public static int getMax(int a, int b) {
        return a >= b ? a : b;
    }

    public static float getMax(float a, float b) {
        return a >= b ? a : b;
    }

    public void getCaseSix() {
        System.out.print("Enter first number: ");
        float aFloat = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float bFloat = scanner.nextFloat();
        int aInt = (int)aFloat, bInt = (int)bFloat;

        System.out.print("Maximum number is: ");
        if ((aFloat % aInt == 0) && (bFloat % bInt == 0)) System.out.println(getMax(aInt, bInt));
        else System.out.println(getMax(aFloat, bFloat));
    }
}







