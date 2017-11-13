package com.mazurnata.practice.module3;

public class SwitchExamples {
    public static void main(String[] args) {
        gradeSwitch();
        numericSwitchExample();
    }

    private static void gradeSwitch() {

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Отлично!");
                break;
            case 'B':
            case 'C':
                System.out.println("Отлично выполнено");
                break;
            case 'D':
                System.out.println("Вы прошли");
            case 'F':
                System.out.println("Лучше попробуйте снова");
                break;
            default:
                System.out.println("Неверная оценка");
        }
        System.out.println("Ваша оценка " + grade);
    }
    private static void numericSwitchExample() {
        int num = 8;
        switch(num){

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
    }
}
