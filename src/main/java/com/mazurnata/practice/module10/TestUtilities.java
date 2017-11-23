package com.mazurnata.practice.module10;

import java.util.ArrayList;
import java.util.List;

public class TestUtilities {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println("Вывод списка до обработки дженерик-методом: " + list);

        Utilities.fill(list, 3);
        System.out.println("Список после обработки дженерик-методом: " + list);
    }
}
