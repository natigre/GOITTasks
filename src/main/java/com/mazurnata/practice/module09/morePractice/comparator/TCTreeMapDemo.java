package com.mazurnata.practice.module09.morePractice.comparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TCTreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("J. Dou", 3434.4);
        tm.put("T. Smith", 123.2);
        tm.put("J. Bekker", 1378.0);
        tm.put("T. Holl", 99.2);
        tm.put("R. Smith", -19.08);

        //получаем множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //выводим элементы множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("J. Dou");
        tm.put("J. Dou", balance + 1000);
        System.out.println("new count J. Dou: " + tm.get("J. Dou"));

    }
}
