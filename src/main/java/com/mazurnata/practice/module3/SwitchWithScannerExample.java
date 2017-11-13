package com.mazurnata.practice.module3;

import java.util.Scanner;

public class SwitchWithScannerExample {
    public static void main(String[] args) {
        scannerEnter();
    }

    private static void scannerEnter() {
        Scanner in = new Scanner(System.in);
        System.out.println(" Please enter the number: ");
        String string = in.nextLine();

        switch (string) {
            case "Y":
                System.out.println("You klicked letter Y");
                break;
            case "N":
                System.out.println("You klicked letter N");
                break;
            default:
                System.out.println("You klicked unknown letter");
        }
    }
}
