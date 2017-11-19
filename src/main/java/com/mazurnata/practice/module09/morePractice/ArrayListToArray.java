package com.mazurnata.practice.module09.morePractice;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Content of a list array: " + list);

        //get common array
        Integer ia[] = new Integer[list.size()];
        ia = list.toArray(ia);

        int sum = 0;
        //get sum elements of array
        for (int i : ia) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
