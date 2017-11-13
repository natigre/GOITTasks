package com.mazurnata.practice.module07.animal.types;

public class AnimalBirds extends Animal {

    public AnimalBirds(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    public void movement() {
        System.out.println("wings");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("\tmovement:" + "wings");
    }
}
