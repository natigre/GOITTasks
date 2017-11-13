package com.mazurnata.practice.module3;

public class IfElseIfElseExamples {
    public static void main(String[] args) {
        simpleExample();
        anotherExample();
        operatorIfWithLogicOperators();
    }
    private static void simpleExample() {
        int x = 30;

        if (x == 10) {
            System.out.println("Значение X = 10");
        } else if (x == 20) {
            System.out.println("Значение X = 20");
        } else if (x == 30) {
            System.out.println("Значение X = 30");
        } else {
            System.out.println("Это оператор else");
        }
    }

    private static void anotherExample() {
        int num1 = 6;
        int num2 = 8;
        if(num1>num2){
            System.out.println("Первое число больше второго");
        }
        else if(num1<num2){
            System.out.println("Первое число меньше второго");
        }
        else{
            System.out.println("Числа равны");
        }
    }
    private static void operatorIfWithLogicOperators() {
        int num3 = 8;
        int num4 = 6;
        if(num3 > num4 && num3>7){
            System.out.println("Первое число больше второго и больше 7");
        }
    }
}
