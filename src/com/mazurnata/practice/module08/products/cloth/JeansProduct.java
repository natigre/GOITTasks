package com.mazurnata.practice.module08.products.cloth;

import com.mazurnata.practice.module08.products.Sale;

public class JeansProduct extends SuperClothesProduct implements Sale{
    public JeansProduct(int id, String name) {
        super(id, name);
    }

    @Override
    public float getSale() {
        return 0.5f; //50%
    }
}
