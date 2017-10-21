package com.mazurnata.practice.module07.modifier;

class Soup1 {
    private Soup1() {}
    //(1) разрешаем создание объектов в статическом методе:
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}
