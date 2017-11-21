package com.mazurnata.practice.module09.morePractice;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {

        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.print("the original content of the list array: ");
        for (int v : vals) {
            System.out.println(v + " ");
        }
        System.out.println();

        //find sum
        int sum = 0;
        for (int v : vals) {
            sum += v;
        }
        System.out.println("Sum of elemnts: " + sum);
    }
}
