package com.mazurnata.practice.module08.fileExamples;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 программа, которая создает InputStreamReader для чтения стандартного потока ввода, до введения пользователем "q"
 */
public class ReadConsole {
    public static void main(String[] args) throws IOException {

        InputStreamReader input = null;

        try {
            input = new InputStreamReader(System.in);
            System.out.println("Введите символы, символ 'q' для выхода.");
            char a;

            do {
                a = (char) input.read();
                System.out.print(a);
            } while (a != 'q');
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
