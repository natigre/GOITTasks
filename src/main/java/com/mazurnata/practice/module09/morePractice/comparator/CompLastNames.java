package com.mazurnata.practice.module09.morePractice.comparator;

/*
Использовать метод thenComparing() для сортировки счетов вкладчиков сначала по фамилии,
а потом по именам
 */

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {
    //компаратор, сравниваающий фамилии вкладчиков
    @Override
    public int compare(String aStr, String bStr) {
        int i, j;

        //найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
