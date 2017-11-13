package com.mazurnata.practice.module09.comparator_example;

public class MyClassCompare extends MyClassComparator implements Comparable<MyClassCompare> {
    private String name;

    public MyClassCompare(String name) {
        this.name = name;
    }
    // этот метод как раз и сравнивает текущий обхект с другим,
    // который передается в качестве аргумента

    @Override
    public int compareTo(MyClassCompare o) {
        return name.compareTo(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
