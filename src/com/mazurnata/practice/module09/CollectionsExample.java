package com.mazurnata.practice.module09;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("jkfjfl");
        list.add("nv,mdn");
        list.add("jpoiop");
        list.add("wqeiq");

        //достать элемент можем по индексу
        list.get(0);

        //быстрый и оптимальный способ
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
        //медленный и непродуктивный
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            System.out.println(value);
        }

    }
}
