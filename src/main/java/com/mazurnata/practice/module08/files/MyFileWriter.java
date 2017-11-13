package com.mazurnata.practice.module08.files;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter extends SuperFile {

    public MyFileWriter(String path) {
        super(path);
    }

    public void write(String text) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(text);
            fileWriter.flush(); //записываем в сам файл
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
