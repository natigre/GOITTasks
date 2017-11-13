package com.mazurnata.practice.module3;

public class BreakAndContinue {
    public static void main(String[] args) {
        int[] arr = {1, 62, 81, 37, 20, 13, 0, 44, 9, 12, 16, 74};
        for (int i = 0; i < arr.length; i++) {
            if (i == 74) break;         //выход из циикла
            if (i % 9 != 0) continue;   //следующая итерация
            System.out.print(i + " ");
        }
        System.out.println();

        //using foreach
        for (int i :arr) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        //using while
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
