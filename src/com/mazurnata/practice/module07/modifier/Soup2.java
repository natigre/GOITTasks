package com.mazurnata.practice.module07.modifier;

class Soup2 {
    private Soup2() {}
    //(2) создаем один статический об]ект и по требованию возвращаем ссылку на него
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }

    public void f() {}

}
