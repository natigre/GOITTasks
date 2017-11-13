package com.mazurnata.practice.module09.comparator_example;

import java.util.Comparator;

public class MyClassComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
