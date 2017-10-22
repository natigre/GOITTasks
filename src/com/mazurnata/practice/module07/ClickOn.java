package com.mazurnata.practice.module07;

public class ClickOn {
    public static void main(String[] args) {

        // Figure figure = new Figure(10, 10); // так нельзя
        Triangle triangle = new Triangle(10, 8);

        Figure figure; // так можно, так как объект мы не создаем
        figure = triangle;

    }
}
