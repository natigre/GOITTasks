package com.mazurnata.hometasks.module08;

public class Flower {
    private static final int PRICE_OF_ROSE = 100;
    private static final int PRICE_OF_CHAMOMILE = 75;
    private static final int PRICE_OF_TULIP = 45;

    private int price;

    public Flower() {
        if (this instanceof Rose) this.price = PRICE_OF_ROSE;
        if (this instanceof Chamomile) this.price = PRICE_OF_CHAMOMILE;
        if (this instanceof Tulip) this.price = PRICE_OF_TULIP;
    }

    public Flower(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flower" +
                "price: " + price;
    }
}
