package com.mazurnata.practice.module08.products.cloth;

import com.mazurnata.practice.module08.products.NoSallable;

public class DressProduct extends SuperClothesProduct implements NoSallable{
    public DressProduct(int id, String name) {
        super(id, name);
    }
}
