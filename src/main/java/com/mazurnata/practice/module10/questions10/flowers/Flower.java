package com.mazurnata.practice.module10.questions10.flowers;

public class Flower {
    public String name;
    public double price;

    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
