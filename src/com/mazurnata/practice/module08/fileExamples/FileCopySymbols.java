package com.mazurnata.practice.module08.fileExamples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopySymbols {
    public static void main(String[] args) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;

        try {
            fileIn = new FileReader("files/lesson08/file.txt");
            fileOut = new FileWriter("files/lesson08/copied_file.txt");

            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
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
