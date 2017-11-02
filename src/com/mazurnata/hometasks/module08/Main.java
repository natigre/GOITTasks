package com.mazurnata.hometasks.module08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FlowerStore flowerStore = new FlowerStore();
        System.out.println(Arrays.toString(flowerStore.sell(2, 5, 2)));
        System.out.println(Arrays.toString(flowerStore.sellSequence(2,7,3)));

    }
}
