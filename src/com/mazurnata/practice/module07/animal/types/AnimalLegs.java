package com.mazurnata.practice.module07.animal.types;

public class AnimalLegs extends Animal {

    public AnimalLegs(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    public void movement() {
        System.out.println("legs");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("\t movement:" + "лапы");
    }
}
