package com.mazurnata.practice.module05.EmployeeExample;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public void setId(int id) {
        this.id = nextId;
    }

    public static int getNextId() {

        return nextId;
    }

    public int getId() {
        return id;
    }
}
