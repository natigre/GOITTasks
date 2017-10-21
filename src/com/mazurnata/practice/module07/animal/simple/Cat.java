package com.mazurnata.practice.module07.animal.simple;

public class Cat extends BaseAnimal {

    public Cat(String name, int age, float wieght) {
        super(name, age, wieght);
    }

    @Override //переопределили метод из суперкласса, использовав ctrl + o
    public float getWeight() {
        return super.getWeight() + 5;
    }

}
