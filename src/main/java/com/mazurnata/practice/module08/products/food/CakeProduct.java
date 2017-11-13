package com.mazurnata.practice.module08.products.food;

public class CakeProduct extends SuperFoodProduct {
    private int countOfCandles;

    public CakeProduct(int id, String name, int expiration, int countOfCandles) {
        super(id, name, expiration);
        this.countOfCandles = countOfCandles;
    }

    public int getCountOfCandles() {
        return countOfCandles;
    }

    public void setCountOfCandles(int countOfCandles) {
        this.countOfCandles = countOfCandles;
    }
}
