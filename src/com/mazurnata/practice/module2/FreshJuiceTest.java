package com.mazurnata.practice.module2;

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice freshJuice = new FreshJuice();
        freshJuice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size " + freshJuice.size);

    }
}
