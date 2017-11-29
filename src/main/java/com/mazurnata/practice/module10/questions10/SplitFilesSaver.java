package com.mazurnata.practice.module10.questions10;

import com.mazurnata.practice.module10.questions10.flowers.Flower;
import com.mazurnata.practice.module10.questions10.flowers.FlowerStore;

public class SplitFilesSaver {
    public static void main(String[] args) {

        FlowerStore store = new FlowerStore();
//        store.flowers.add(new Flower("rose", 25));
//        store.flowers.add(new Flower("tulip", 15));
//        store.flowers.add(new Flower("chamomile", 13));
//        store.flowers.add(new Flower("peony", 22));
//        store.flowers.add(new Flower("narcissus", 10));
//
//        store.save("files/lesson10/store_save.txt");

        store.load("files/lesson10/store_save.txt");
        System.out.println(store);
    }
}
