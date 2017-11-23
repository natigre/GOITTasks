package com.mazurnata.practice.module09.morePractice.comparator;

/*
сортировка с помощью компаратора по фамилии
 */

import java.util.Comparator;

public class TComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;

        //найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) {  //фамилии совпадают, проверить фамилию и имя полностью
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
}
