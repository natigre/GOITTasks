package com.mazurnata.hometasks.module07.task01.players;

public class Player4 extends PlayerGetPlaylist {

    public Player4(double price, String[] playlist) {
        super(price, playlist);
    }

    @Override
    public void playSong(String[] playlist) {
        super.playSong(playlist[playlist.length - 1]);
    }

    @Override
    public void playAllSongs(String[] playlist) {
        System.out.println("Playing playlist: ");
        for (int i = 0; i < playlist.length; i++) {
            playSong(playlist[i]);
        }
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
