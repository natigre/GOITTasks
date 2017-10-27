package com.mazurnata.practice.module07.exampleDZ;

import javafx.scene.control.Label;

public abstract class MuiltyfunctionalPlayer extends Player {
    protected Label[] label;
    protected String[] playlist = new String[]{song1, "Good Song", "Super Song"};

    public MuiltyfunctionalPlayer(double price) {
        super(price);
    }

    public void playAllSong() {
        for (String songCount :playlist) {
            System.out.println("Playing " + songCount);
        }
    }
}
