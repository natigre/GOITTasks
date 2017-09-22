package com.mazurnata.practice.module4;

public class MethodExamples {
    public static void main(String[] args) {
        System.out.println("Min value " + minFunction(5, 3));
        methodRankPoints(330.25);

        String mes = getMessage(); // вызов первого метода
        System.out.println(mes);
        getSum(); // вызов второго метода

        int result = getSum(4, 6);
        System.out.println(result);
    }

    private static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Ранг A1");
        } else if (points >= 122.4) {
            System.out.println("Ранг A2");
        } else {
            System.out.println("Ранг A3");
        }
    }

    static String getMessage() {
        return "Hell to World";
    }

    static void getSum() {
        int x = 2;
        int y = 3;
        System.out.printf("%d + %d = %d \n", x, y, x + y);
    }

    static int getSum(int x, int y) {
        return x + y;
    }


}
