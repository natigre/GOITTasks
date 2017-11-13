package com.mazurnata.hometasks.module07.task01.players;

public class PlayerModel {
    private final double price;

    public PlayerModel(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void playSong(String song) {
        System.out.println("Playing: " + song);
    }
}
