package com.mazurnata.practice.module09.morePractice.comparator;

import java.util.TreeSet;

public class CompDemoWithLambda {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("F");
        ts.add("D");

        for (String el : ts) {
            System.out.print(el + " ");
        }
        System.out.println();

    }
}
