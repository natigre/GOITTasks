package com.mazurnata.hometasks.module07.task01.players;

public class PlayerGetPlaylist extends PlayerModel {
    protected String[] playlist;

    public PlayerGetPlaylist(double price, String[] playlist) {
        super(price);
        this.playlist = playlist;
    }

    public void playSong(String[] playlist) {
        super.playSong(playlist[0]);
    }

    public void playAllSongs(String[] playlist) {
        System.out.println("Playing playlist: ");
        for (int i = 0; i < playlist.length; i++) {
            playSong(playlist[i]);
        }
    }
}
