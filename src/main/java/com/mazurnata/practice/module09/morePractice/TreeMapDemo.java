package com.mazurnata.practice.module09.morePractice;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("J. Dou", 3434.4);
        tm.put("T. Smith", 123.2);
        tm.put("J. Bekker", 1378.0);
        tm.put("T. Holl", 99.2);
        tm.put("R. Smith", -19.08);

        //получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //снести сумму 1000 на счет Доу
        double balance = tm.get("J. Dou");
        tm.put("J. Dou", balance + 1000);
        System.out.println("new account balance " + tm.get("J. Dou"));
    }
}
