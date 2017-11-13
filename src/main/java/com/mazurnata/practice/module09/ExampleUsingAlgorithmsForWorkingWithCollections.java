package com.mazurnata.practice.module09;

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleUsingAlgorithmsForWorkingWithCollections {
    public static void main(String[] args) {

        List<MyClass> list = new ArrayList<>();
        list.add(new MyClass("Vasyl"));
        list.add(new MyClass("Pavlo"));
        list.add(new MyClass("Andrij"));
        list.add(new MyClass("Andrij"));
        list.add(new MyClass("Olga"));

        printCollection("Original", list);

        Collections.shuffle(list);
        printCollection("Shuflle: ", list);

        Collections.reverse(list);
        printCollection("Reverse order: ", list);

        //"Проворачивание" на определенное количество
        Collections.rotate(list, 2);
        printCollection("Rotate list: ", list);

        Collections.swap(list, 0, list.size() - 1);
        printCollection("Swap of elements: ", list);

        Collections.replaceAll(list, new MyClass("Andrij"), new MyClass("Alex"));
        printCollection("Replace: ", list);

        // Копирование - здесь обязательно надо иметь нужные размеры
        List<MyClass> list2 = new ArrayList<>(list.size());
        for (MyClass myClass : list) {
            list2.add(null);
        }
        // Компируем из правого аргумента в левый
        Collections.copy(list2, list);
        printCollection("Copy: ", list);

        // Полная замена
        Collections.fill(list2, new MyClass("Antony"));
        printCollection("Full  fill: ", list2);
        


    }

    private static void printCollection(String titile, List<MyClass> list) {
        System.out.println(titile);
        for (MyClass myClass : list) {
            System.out.println("item: " + myClass);
        }
        System.out.println();
    }
}
