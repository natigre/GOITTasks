package com.mazurnata.practice.module09.morePractice.adress;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Adress> ml = new LinkedList<>();
        ml.add(new Adress("West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Adress("Ralph", "1142 Marple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Adress("Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        for (Adress element : ml) {
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
