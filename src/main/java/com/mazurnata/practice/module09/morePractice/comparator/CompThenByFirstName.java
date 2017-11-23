package com.mazurnata.practice.module09.morePractice.comparator;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {
    //отсортировать счета вклавдчиков по ФИО, если фамилии одинаковы
    @Override
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}
