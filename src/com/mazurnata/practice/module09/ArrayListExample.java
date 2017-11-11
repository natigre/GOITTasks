package com.mazurnata.practice.module09;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] array = new int[]{
                100,
                20,
                -30
        };
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(-30);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] list " + list.get(i));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] array " + array[i]);
        }
        System.out.println();

        list.add(1, 0);
        list.add(3, 0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] list " + list.get(i));
        }

        System.out.println();
        while(list.remove((Integer) 0)) {} //удаляем по значению
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] list " + list.get(i));
        }

        System.out.println("-30 has index: " + list.indexOf(-30));
        System.out.println("150 has index: " + list.indexOf(150));
    }
}
