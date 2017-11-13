package com.mazurnata.hometasks.module07.task01.players;

public class Player2 extends PlayerGetSong {

    public Player2(double price, String nameSong) {
        super(price, nameSong);
    }

    @Override
    public void playSong(String song) {
        System.out.println("Oh, no! Error.");
    }

    @Override
    public String getSong() {
        return super.getSong();
    }
}
