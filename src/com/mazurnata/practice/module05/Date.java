package com.mazurnata.practice.module05;

import java.time.LocalDate;

public class Date {


    public static void main(String[] args) {
        String d = new Date().toString();
        System.out.println(d);

        Date birthday = new Date();
        Date deadline = new Date();
        deadline = null;
        deadline = birthday;

        if (deadline != null) {
            System.out.println(deadline);
        }

        LocalDate newYearsEve = LocalDate.of(1999,12,31);
        int year = newYearsEve.getYear();
        int month = newYearsEve.getMonthValue();
        int day = newYearsEve.getDayOfMonth();

        //метод plusDays()
        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        year = aThousandDaysLater.getYear();
        month = aThousandDaysLater.getMonthValue();
        day = aThousandDaysLater.getDayOfMonth();

    }
}
