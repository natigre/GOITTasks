package com.mazurnata.practice.module09.morePractice.comparator;

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
//        TreeSet<String> ts = new TreeSet<>();

        MyComp mc = new MyComp();
        //передать вариант компаратора типа MyComp с обратным упорядочиванием древов. множ-ву
        TreeSet<String> ts = new TreeSet<>(mc.reversed());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("F");
        ts.add("D");

        //вывести элементы из древовижного множества
        for (String el : ts) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
