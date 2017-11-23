package com.mazurnata.practice.module09.morePractice.comparator;

/*
Компаратор для сравнеия символьных строк в обратном порядке
 */

import java.util.Comparator;

public class MyComp implements Comparator<String> {

    //    @Override
//    public int compare(String a, String b) {
//        String aStr, bStr;
//        aStr = a;
//        bStr = b;
//        //выполнить сравнение в обратном порядке
//        return bStr.compareTo(aStr);
//    }

    //short form
    @Override
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }
}
