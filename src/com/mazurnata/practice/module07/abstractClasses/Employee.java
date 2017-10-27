package com.mazurnata.practice.module07.abstractClasses;

import java.time.LocalDate;

public class Employee extends Person {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject) {
//        быстро проверить обьект на идетничность
        if (this == otherObject) return true;

//        если явный параметр имеет пустое значение налл, должно быть возвращено логическое значение фолс
//        если классы не совпадают, они не равны
        if (otherObject == null || getClass() != otherObject.getClass()) return false;

//        теперь известно, что otherObject - это не пустой объект типа Employee
        Employee employee = (Employee) otherObject;

//        проверить, содержат ли поля одинаковые значения
        if (Double.compare(employee.salary, salary) != 0) return false;
        return hireDay != null ? hireDay.equals(employee.hireDay) : employee.hireDay == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (hireDay != null ? hireDay.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name= " + name;
    }
}
