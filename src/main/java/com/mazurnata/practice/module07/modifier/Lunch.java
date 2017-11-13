package com.mazurnata.practice.module07.modifier;

//в файле может быть определен только один public-класс
public class Lunch {
    void testPrivate() {
        //запрещено, так как конструктор объявлен приватным
        //!Soup1 soup = new Soup
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }
    void testSigleton() {
        Soup2.access().f();
    }
}
