package com.mazurnata.practice.module3;

import java.util.Scanner;

public class SwitchWithScannerExampleHor {
    public static void main(String[] args) {
        scannerEnter();
    }

    private static void scannerEnter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Select an options (1, 2, 3, 4)");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You klicked letter Y");
                break;
            case 2:
                System.out.println("You klicked letter N");
                break;
            case 3:
                System.out.println("You klicked letter N");
                break;
            case 4:
                System.out.println("You klicked letter N");
                break;
            default:
                System.out.println("You klicked unknown letter");
        }
    }
}
