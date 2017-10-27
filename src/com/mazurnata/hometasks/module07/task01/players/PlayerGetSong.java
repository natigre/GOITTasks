package com.mazurnata.hometasks.module07.task01.players;

public class PlayerGetSong extends PlayerModel {
    private String song;

    public PlayerGetSong(double price, String nameSong) {
        super(price);
        this.song = nameSong;
    }

    public String getSong() {
        return song;
    }
}
