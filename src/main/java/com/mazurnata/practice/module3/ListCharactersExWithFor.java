package com.mazurnata.practice.module3;

public class ListCharactersExWithFor {
    public static void main(String[] args) {
        for (int c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {//метод проверяет явл. ли некоторая буква строчной
                System.out.println("value: " + (int)c + " symbol" + c);
            }
        }
    }
}
