package com.mazurnata.practice.module07.abstractClasses;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        //заполнить массив people объектами типа Student/Employee
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");


        //вывести имена и описания всех лиц, представленных объектами тира Person
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
