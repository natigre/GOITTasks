package com.mazurnata.hometasks.module08;

import java.util.Arrays;

public class Main {
    private static final String PATH = "flowers_data.txt";

    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        System.out.println(Arrays.toString(flowerStore.sell(2, 5, 2)));
        System.out.println(Arrays.toString(flowerStore.sellSequence(2,7,3)));

        System.out.println("The store's wallet is replenished " + flowerStore.getWallet());

        FlowersSaver.save(PATH, flowerStore.sell(3,5,7));

        FlowersLoader.load(PATH);
    }
}
