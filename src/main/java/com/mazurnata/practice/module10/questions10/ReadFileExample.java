package com.mazurnata.practice.module10.questions10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) throws FileNotFoundException {
        //считывание файла одной строкой
        Scanner scanner = new Scanner(new File("files/lesson10/delimetr.txt"))
                .useDelimiter("\\Z ");

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

}
