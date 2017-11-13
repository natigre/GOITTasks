package com.mazurnata.practice.module08;

import com.mazurnata.practice.module08.products.NoSallable;
import com.mazurnata.practice.module08.products.Sale;
import com.mazurnata.practice.module08.products.SuperProduct;
import com.mazurnata.practice.module08.products.cloth.JeansProduct;
import com.mazurnata.practice.module08.products.cloth.TShirtProduct;
import com.mazurnata.practice.module08.products.food.BananaProduct;
import com.mazurnata.practice.module08.products.food.CakeProduct;

public class PolimorphismExample {

    public static void main(String[] args) {
        //using polimorphism
//        SuperProduct product = new BananaProduct(10, "banana", 25);
//        SuperProduct product1 = new CakeProduct(10, "cake", 60);
//        SuperProduct product2 = new TShirtProduct(10, "tshirt");

        SuperProduct[] products = new SuperProduct[] {
                new BananaProduct(10, "banana", 25),
                new CakeProduct(2, "cake", 60, 5),
                new TShirtProduct(15, "tshirt"),
                new JeansProduct(24, "jeans")
        };

        for (SuperProduct product : products) {
            product.show();

            //0 == 0
            //0 == int - true
            //" " == int - false
             boolean isCake = product instanceof CakeProduct;
             if (isCake) {
                 CakeProduct cake = (CakeProduct) product; //явное приведение
                 //которое дает нам возможность вызвать метод класса CakeProduct
                 cake.setName("bad cake");
                 product.show();
                 System.out.println("Cake is found and has such " + cake.getCountOfCandles() + " candels");
             }

             if (product instanceof NoSallable) {
                 System.out.println("Этот продукт не продается - " + product.getName());
             }

             if (product instanceof Sale) {
                 Sale sale = (Sale)product;
                 System.out.println("You have sale in size " + (sale.getSale()) * 100 + "%");
             }
        }

    }
}
