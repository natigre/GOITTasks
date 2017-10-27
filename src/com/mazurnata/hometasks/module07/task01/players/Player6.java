package com.mazurnata.hometasks.module07.task01.players;

import java.util.Random;

public class Player6 extends Player3 {

    public Player6(double price, String[] playlist) {
        super(price, playlist);
    }

    public void shuffle(String[] playlist) {
        Random random = new Random();
        System.out.println("Playing shuffled playlist: ");
        for (int i = playlist.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String tmp = playlist[index];
            playlist[index] = playlist[i];
            playlist[i] = tmp;
            System.out.println(tmp);
        }
    }

    @Override
    public void playSong(String[] playlist) {
        super.playSong(playlist);
    }

    @Override
    public void playAllSongs(String[] playlist) {
        super.playAllSongs(playlist);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
