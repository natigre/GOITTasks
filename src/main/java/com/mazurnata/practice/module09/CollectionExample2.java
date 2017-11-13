package com.mazurnata.practice.module09;

import com.mazurnata.practice.module09.util.Person;

import java.util.LinkedList;
import java.util.Stack;

public class CollectionExample2 {
    static void workWithPerson(Person person) {
        System.out.println("Person " + person.name + " got ticket and went away");
    }

    public static void main(String[] args) {

        LinkedList<Person> queue = new LinkedList<>();

        //симуляция работы очереди в кассу (FIFO)
        //------------------------------------
        queue.add(new Person());//пришли люди
        queue.add(new Person());
        queue.add(new Person());

        workWithPerson(queue.poll());//кассир обработал человека

        queue.add(new Person());

        workWithPerson(queue.poll());
        workWithPerson(queue.poll());

        queue.add(new Person());
        queue.add(new Person());
        queue.add(new Person());

        workWithPerson(queue.poll());
        workWithPerson(queue.poll());
        workWithPerson(queue.poll());
        workWithPerson(queue.poll());
        //--------------------------------------------

        System.out.println();
        System.out.println();
        System.out.println();

        Person.refreshCounter();

        Stack<Person> stack = new Stack<>();
        //стимуляция работы стека(LIFO)
        //--------------------------------------------
        stack.push(new Person());
        stack.push(new Person());

        workWithPerson(stack.pop());

        stack.push(new Person());
        stack.push(new Person());

        workWithPerson(stack.pop());

        stack.push(new Person());

        workWithPerson(stack.pop());
        workWithPerson(stack.pop());

        stack.push(new Person());

        workWithPerson(stack.pop());
        workWithPerson(stack.pop());







    }
}
