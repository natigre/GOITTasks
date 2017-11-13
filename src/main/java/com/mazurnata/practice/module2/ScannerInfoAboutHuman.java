package com.mazurnata.practice.module2;

import java.util.Scanner;

public class ScannerInfoAboutHuman {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name pls: ");
        String name = in.nextLine();
        System.out.println("Enter your age pls: ");
        int age = in.nextInt();

        System.out.println("Your name is " + name + ", your age is " + age);
    }
}
