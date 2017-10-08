package com.mazurnata.hometasks.module05.useCar;

public class Main {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        System.out.println(carDoor.toString());
//        carDoor.checkConditionOfTheWindow();

        CarWheel carWheel = new CarWheel();
        System.out.println(carWheel.toString());


        Car car = new Car(2017, "gasoline", 125.1,
                5.0, 4, 2, 90);
        System.out.println(car.toString());


    }
}
