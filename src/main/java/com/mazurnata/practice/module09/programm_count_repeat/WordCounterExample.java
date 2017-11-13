package com.mazurnata.practice.module09.programm_count_repeat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class WordCounterExample {

    static String clearText(String text) {
        return text.toLowerCase()
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\n", "")
                .replaceAll("\r", "");
    }

    static SortedMap<String, Integer> calcWordsRepeats(String text) {

        //отсортируем слова по значению
        SortedMap<String, Integer> result = new TreeMap<>();
        String[] words = text.split(" ");//получаем массив слов из очищенного текста, при этом
        // разделяем каждое слово пробелом

        for (String word : words) {
//            result.put(word, result.get(word) + 1);//в таком методе словили эксепшн
            int oldValue = result.getOrDefault(word, 0); //получили предыдущее значение

            result.put(word, oldValue + 1);//в таком методе словили эксепшн

        }
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String dirtyText = new Scanner(new File("files/lesson09/text.txt")).useDelimiter("\\Z").next();

        String clearText = clearText(dirtyText);
//        System.out.println(text);
        SortedMap<String, Integer> result = calcWordsRepeats(clearText);

        for (String word : result.keySet()) {
            int count = result.get(word);
            System.out.println("" + count + "\t\t\t" + word);
        }

//        System.out.println(dirtyText);
    }
}

