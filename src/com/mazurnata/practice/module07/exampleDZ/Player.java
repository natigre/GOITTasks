package com.mazurnata.practice.module07.exampleDZ;

import javafx.application.Application;
import javafx.scene.layout.Pane;

public abstract class Player  extends Application implements ModelPlayer {
    String song1 = "The Best Song";
    private final double price;

    public Player(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract void show(Pane root);

    public String playSong() {
        String songName = "Playing " + song1;
        return songName;
    }
}
