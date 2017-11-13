package com.mazurnata.practice.module07.animal.simple;

public class Snake extends BaseAnimal {
    private float length;

    public Snake() {
        this(null, 0,0);
    }

    public Snake(String name, int age, float wieght) {
        //1 variant
//        super(name, age, wieght);
        //------------------------
        //2 variant. thai variant is better
        this(name, age, wieght, 10);//устанавливаем дефолтное значение для length
    }


    public Snake(String name, int age, float wieght, float length) {
        super(name, age, wieght);
        this.length = length;
    }

    public void doSmth() {
        name = "";
    }
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
}
