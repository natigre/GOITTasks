package com.mazurnata.practice.module05.animal;

public class Dog {
    public String name = "default";
    private int age = 0;

    public Dog() {
//        empty constructor
    }

    public Dog(String name) {
        this(name, -1);
    }

    public Dog(int age) {
        this("no name", age);
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.println("name: \t" + name);
        System.out.println("age: \t" + age);
    }

    public int getAge() {// геттер - метод который возвращает значение поля объекла класса
        return age;
    }

    public void setAge(int age) {// сеттер - метод который перезаписывает значение поля объекта класса
        this.age = age;
    }
}
