package com.mazurnata.practice.module09.morePractice;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);

        //using interface NavigableSet
        System.out.println(ts.subSet("C", "F"));
    }
}
