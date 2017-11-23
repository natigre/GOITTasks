package com.mazurnata.practice.module10;

import java.util.List;

public class Utilities {
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
    }
}
