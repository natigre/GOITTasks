package com.mazurnata.practice.module09.morePractice;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");
        System.out.println("extraction from stack: ");

        while (arrayDeque.peek() != null) {
            System.out.println(arrayDeque.pop() + " ");
        }
        System.out.println();
    }
}
