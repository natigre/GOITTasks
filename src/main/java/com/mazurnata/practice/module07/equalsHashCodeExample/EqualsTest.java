package com.mazurnata.practice.module07.equalsHashCodeExample;

import com.mazurnata.practice.module07.abstractClasses.Employee;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);

        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10,1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println(alice1.equals(alice3));
        System.out.println(alice1.equals(bob));
        System.out.println(bob);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println(boss);
        System.out.println(carl.equals(boss));
        System.out.println(alice1.hashCode());
        System.out.println(alice3.hashCode());
        System.out.println(bob.hashCode());
        System.out.println(carl.hashCode());


    }
}
