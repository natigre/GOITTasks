package com.mazurnata.hometasks.module08;

import java.io.BufferedReader;
import java.io.FileReader;

public abstract class FlowersLoader {
    private static final String SEPARATOR = ";";

    public static Flower[] load(String path) {
        try {
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();
            String[] elements = line.split(SEPARATOR);
            Flower[] flowers = new Flower[elements.length];

            for (int i = 0; i < flowers.length; i++) {
                if (elements[i].equals("Rose"))
                    flowers[i] = new Rose();
                if (elements[i].equals("Chamomile"))
                    flowers[i] = new Chamomile();
                if (elements[i].equals("Tulip"))
                    flowers[i] = new Tulip();
            }
            return flowers;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
