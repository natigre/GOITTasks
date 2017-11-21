package com.mazurnata.practice.module09.morePractice;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //create a method tryAdvance()for outputting content for AL
        System.out.println("the original content of the list array: ");
        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        //create new AL
        spliterator = vals.spliterator();
        ArrayList<Double> sqrt = new ArrayList<>();
        while (spliterator.tryAdvance((n) -> sqrt.add(Math.sqrt(n))));

        //call the method forEachRemaning() to output the content
        System.out.println("the original content of the list array: ");
        spliterator = sqrt.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
        System.out.println();

    }
}
