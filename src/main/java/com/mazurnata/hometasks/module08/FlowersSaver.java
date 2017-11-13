package com.mazurnata.hometasks.module08;

import java.io.FileWriter;
import java.io.IOException;

public abstract class FlowersSaver {

    public static void save(String path, Flower[] flowers) {
        try {
            FileWriter writer = new FileWriter(path, false);

            for(Flower flower : flowers) {
                writer.write(flower.toString());

                writer.write("\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
