package com.mazurnata.practice.module07.animal.types;

public class AnimalSnake extends Animal {

    public AnimalSnake(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    public void movement() {
        System.out.println("body");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("\t movement:" + "при помощи движения тела");
    }
}
