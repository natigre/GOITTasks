package com.mazurnata.practice.module09.morePractice;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        System.out.println("The inital size of an AL: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of AL after adding of the element: " +
                al.size());
        System.out.println("Contents of a list array: " + al);

        al.remove("F");
        al.remove(2);
        System.out.println("Size of AL after removing of elements: " + al.size());
        System.out.println("Contents of a list array: " + al);
    }
}
