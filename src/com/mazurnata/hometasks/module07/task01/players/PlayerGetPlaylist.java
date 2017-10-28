package com.mazurnata.hometasks.module07.task01.players;

public class PlayerGetPlaylist extends PlayerModel {
    protected String[] playlist;

    public PlayerGetPlaylist(double price, String[] playlist) {
        super(price);
        this.playlist = playlist;
    }

}
