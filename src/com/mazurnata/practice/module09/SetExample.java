package com.mazurnata.practice.module09;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Orange");
        hashSet.add("Fig");
        //addition of duplicate elements
        hashSet.add("Apple");
        hashSet.add("Mango");
        //addition of null values
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);

    }
}
