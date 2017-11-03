package com.mazurnata.hometasks.module08;

import java.util.Arrays;

public class Main {
    private static final String PATH = "flowers_data.txt";

    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        System.out.println(Arrays.toString(flowerStore.sell(10, 5, 2)));
        System.out.println(Arrays.toString(flowerStore.sellSequence(22,18,15)));

        System.out.println("The store's wallet is replenished " + flowerStore.getWallet());

        FlowersSaver.save(PATH, flowerStore.sell(2,2,7));
        FlowersSaver.save(PATH, flowerStore.sellSequence(2,3,4));


    }
}
