package com.mazurnata.practice.module08.files;

public class FileExample {
    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader("files/lesson08/data.txt");
        reader.printFile();
        System.out.println("\n");
        System.out.println(reader.readLines(3));

        MyFileWriter writer = new MyFileWriter("files/lesson08/dataNew.txt");
        writer.write("my new text\n111123565");
        MyFileReader reader1 = new MyFileReader("files/lesson08/dataNew.txt");
        reader1.printFile();
    }
}
