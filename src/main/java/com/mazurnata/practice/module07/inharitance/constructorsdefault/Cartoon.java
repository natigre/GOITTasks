package com.mazurnata.practice.module07.inharitance.constructorsdefault;

public class Cartoon extends Drawing{
    public Cartoon() {
        System.out.println("Constructor Cartoon");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
        System.out.println(x.toString());
    }
}
