package com.mazurnata.practice.module08.products.food;

import com.mazurnata.practice.module08.products.NoSallable;

public class BananaProduct extends SuperFoodProduct implements NoSallable{

    public BananaProduct(int id, String name, int expiration) {
        super(id, name, expiration);
    }
}
