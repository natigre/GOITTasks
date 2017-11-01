package com.mazurnata.practice.module08.products.food;

import com.mazurnata.practice.module08.products.NoSallable;

public class CocaColaProduct extends SuperFoodProduct implements NoSallable {

    public CocaColaProduct(int id, String name, int expiration) {
        super(id, name, expiration);
    }
}
