package com.mazurnata.practice.module07.inharitance;

public class Detergent extends Cleanser {
    //Change method
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); //enter method basic class
    }

    //add new methods
    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
    }
}
