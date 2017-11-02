package com.mazurnata.practice.module08.fileExamples;

/*
Запись файлов. Класс FileWriter
 */

import java.io.FileWriter;
import java.io.IOException;

public class FileApp {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("files/lesson08/some_data.txt", false);

            // запись всей строки
            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text);

            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
