package com.mazurnata.practice.module09.morePractice.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CompLastFirstTreeMapDemo {
    public static void main(String[] args) {
        //использовать метод thenComparing() для создания компаратора, сравниваемого сначала фамилии, а потом имена
        //вклавдчиков по ФИО, если фамилии одинаковы
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThanFirst =
                compLN.thenComparing(new CompThenByFirstName());

        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(compLastThanFirst);
        tm.put("J. Dou", 3434.4);
        tm.put("T. Smith", 123.2);
        tm.put("J. Bekker", 1378.0);
        tm.put("T. Holl", 99.2);
        tm.put("R. Smith", -19.08);

        //получаем множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + " ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //вносим сумму на счет вкладчику
        double balance = tm.get("J. Dou");
        tm.put("J. Dou", balance + 1000);
        System.out.println("New count: " + tm.get("J. Dou"));
    }
}
