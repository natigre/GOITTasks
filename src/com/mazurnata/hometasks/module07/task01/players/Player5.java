package com.mazurnata.hometasks.module07.task01.players;

public class Player5 extends PlayerGetPlaylist {

    public Player5(double price, String[] playlist) {
        super(price, playlist);
    }

    @Override
    public void playSong(String[] playlist) {
        super.playSong(playlist);
    }

    @Override
    public void playAllSongs(String[] playlist) {
        System.out.println("Playing playlist:");
        for (int i = playlist.length-1; i >= 0; i--){
            playSong(playlist[i]);
        }
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
