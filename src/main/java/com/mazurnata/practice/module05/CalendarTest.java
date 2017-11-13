package com.mazurnata.practice.module05;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); //задаем первый день месяца
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        //1 = понедельник, ... 7 = воскресенье
        System.out.print("Mon Tue Wed Thu Fri Sat Sun");
        System.out.println();
        for (int i = 1; i < value; i++) {
            System.out.print(" ");
        }
        while(date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
