package com.mazurnata.hometasks.module07.task01.players;

public class Player3 extends PlayerGetPlaylist {

    public Player3(double price, String[] playlist) {
        super(price, playlist);
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

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
