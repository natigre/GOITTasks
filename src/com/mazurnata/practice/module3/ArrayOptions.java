package com.mazurnata.practice.module3;

import java.util.Arrays;

public class ArrayOptions {

    public static void arraysOfObjects() {
        System.out.println("Arrays of Objects");
        BerylliumShpere[] a;    //Локальная неинициализированная переменная

        BerylliumShpere[] b = new BerylliumShpere[5];
        //Ссылки в массиве автоматически инициализируются null
        System.out.println("b: " + Arrays.toString(b));

        BerylliumShpere[] c = new BerylliumShpere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) { //проверкассылки на null
                c[i] = new BerylliumShpere();
            }
        }

        //Групповая инициализация
        BerylliumShpere[] d = {new BerylliumShpere(),
                new BerylliumShpere(), new BerylliumShpere()};

        //Динамическая инициализация
        a = new BerylliumShpere[]{new BerylliumShpere(), new BerylliumShpere()};
        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);

        a = d;
        System.out.println("a.length = " + a.length);
    }

    public static void arraysOfPrimitives() {
        System.out.println("Arrays of primitives");
        int[] e;    //Null - ссылка; переменная не инициализирована -> ошибка компиляции

        int[] f = new int[5];
        //Примитивы в массиве автоматически инициализируются нулями
        System.out.println("f = " + Arrays.toString(f));

        int[] g = new int[4];
        for (int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }

        int[] h = {11, 47, 93};
        System.out.println("f.length = " + f.length);
        System.out.println("g.length = " + g.length);
        System.out.println("h.length = " + h.length);

        e = h;
        System.out.println("e.length = " + e.length);

        e = new int[]{1, 2};
        System.out.println("e.length = " + e.length);
    }


    public static void main(String[] args) {
        arraysOfObjects();
        System.out.println();
        arraysOfPrimitives();
    }
}
