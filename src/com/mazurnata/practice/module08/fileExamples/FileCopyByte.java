package com.mazurnata.practice.module08.fileExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyByte {
    public static void main(String[] args) throws IOException {

        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream("files/lesson08/file.txt");
            fileOut = new FileOutputStream("files/lesson08/copied_file.txt");

            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);  // Чтение содержимого файла file.txt и запись в файл copied_file.txt
            }

        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}
