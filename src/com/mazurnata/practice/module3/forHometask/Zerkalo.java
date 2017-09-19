package com.mazurnata.practice.module3.forHometask;

import java.util.Arrays;
import java.util.Scanner;

public class Zerkalo {
    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.println ("Enter number of arrays: ");
        // ввод длины массива
        int n = sc.nextInt();
        int[] a = new int[n];


        System.out.println ("Enter your arrays: ");
        // ввод элементов массива
        for (int i = 0; i< n; i++) {
            a[i] = sc.nextInt();
        }

        // вывод длины
        System.out.println ("n = " + n);

        // вывод массива
        String s = Arrays.toString (a);
        System.out.println ("Array a is " + s);

        System.out.println ();

        System.out.println ("Enter your index of arrays: ");
        // ввод индекса элемента массива
        int t = sc.nextInt();

        // вывод нужного элемента на консоль по индексу
        for (int j = 0; j<n; j++) {
            if (j == t) {
                a [j] = a [t];
                System.out.println ("Element is " + a[j]);
                break;
            }
        }

        sc.close ();
    }
}
