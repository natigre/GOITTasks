package com.mazurnata.practice.module08.fileExamples;

/*
InputStream и OutputStream – потоки для чтения, создания и записи файла
 */

import java.io.*;

public class FileInOutExample {
    public static void main(String[] args) {

        try {
            char[] c = {'a', 'b', 'c'};
            OutputStream outputStream = new FileOutputStream("files/lesson08/text_exmaple.txt"); // Создание текстового файла
            for (int i = 0; i < c.length; i++) {
                outputStream.write(c[i]);  //Запись каждого символа в текстовый файл
            }
            outputStream.close();

            InputStream inputStream = new FileInputStream("files/lesson08/text_exmaple.txt");
            int size = inputStream.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char) inputStream.read() + " "); //Чтение текстового файла посимвольно
            }
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

