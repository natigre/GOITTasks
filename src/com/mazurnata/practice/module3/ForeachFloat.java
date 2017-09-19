package com.mazurnata.practice.module3;

import java.util.Random;

/*

Программа создает массив флоат, после чего перебирает все его элементы
 */
public class ForeachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x: f) {
            System.out.println(x);
        }
    }
}
