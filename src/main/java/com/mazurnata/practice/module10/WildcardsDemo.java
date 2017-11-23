package com.mazurnata.practice.module10;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

public class WildcardsDemo {
    //Метод printList принимает список, для которого в сигнатуре использована маска
    static void printList(List<?> list) {
        for (Object l : list) {
            System.out.println("{" + l + "}");
        }
    }

    public static Double sum(List<? extends Number> numList) {
        Double result = 0.0;
        for (Number num : numList) {
            result += num.doubleValue();
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);

        List<String> list1 = new ArrayList<>();
        list1.add("10");
        list1.add("100");
        printList(list1);

        sum(list);
    }
}
