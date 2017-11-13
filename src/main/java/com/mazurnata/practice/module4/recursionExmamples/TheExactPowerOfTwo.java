package com.mazurnata.practice.module4.recursionExmamples;
/*
Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
Операцией возведения в степень пользоваться нельзя!
 */
public class TheExactPowerOfTwo {
    public static int recursion(double n) {
        if (n == 1) {
            return 1;
        } else if (n > 1 && n < 2) {
            return 0;
        } else {
            return recursion(n / 2);
        }
    }

    public static void main(String[] args) {
        double n = 64;
        // вызов рекурсивной функции
        if (recursion(n) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
