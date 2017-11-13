package com.mazurnata.practice.module08.products.food;

import com.mazurnata.practice.module08.products.SuperProduct;

public class SuperFoodProduct extends SuperProduct {
    private int expiration;

    public SuperFoodProduct(int id, String name, int expiration) {
        super(id, name);
        this.expiration = expiration;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("испортиться через " + expiration  + " дней");
    }
}
