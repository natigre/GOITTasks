package com.mazurnata.practice.module05.EmployeeExample;

public class EmployeeTest {
    public static void main(String[] args) {
        //заполняем массив staff тремя объектами типа Employee
//        Employee[] staff = new Employee[3];
//
//        staff[0] = new Employee("Carl Cracker", 7500,1987,12,15);
//        staff[1] = new Employee("Harry Yacker", 5000, 1989, 10, 1);
//        staff[2] = new Employee("Tony Tester", 4000, 1990,3, 15);

//        //поднять всем работникам зарплату на 5%
//        for (Employee employee : staff) {
//            employee.raiseSalary(5);
//        }
//
//        //вывести данные обо всех обьектах типа Employee
//        for (Employee employee: staff) {
//            System.out.println("name = " + employee.getName() + ", salary = " + employee.getSalary()
//            + ", hireDay = " + employee.getHireDay());
//        }
        Employee e = new Employee("Harry", 5000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
