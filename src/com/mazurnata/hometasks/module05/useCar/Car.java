package com.mazurnata.hometasks.module05.useCar;

import java.util.Arrays;

public class Car {

    private final int dataProduce;               //дата производства (не изменна после создания объекта)
    private String engineType;                   //тип двигателя
    private double maxSpeed;                     //максимальная скорость машины (если она новая)
    private double accelerationTimeTo100;        //время разгона до 100км/ч
    private int passengerCapacity;               //пассажировместимость
    private int passengerQuantity;               //кол-во пасажиров внутри в данный момент
    private double currentSpeed;                 //текущая скорость
    private CarWheel[] wheels = new CarWheel[4]; //массив колес
    private CarDoor[] doors = new CarDoor[4];    //массив дверей

    public Car(int dataProduce) {
        this.dataProduce = dataProduce;
    }

    public Car(int dataProduce, String engineType, double maxSpeed, double accelerationTimeTo100,
               int passengerCapacity, int passengerQuantity, double currentSpeed) {
        this.dataProduce = dataProduce;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTimeTo100 = accelerationTimeTo100;
        this.passengerCapacity = passengerCapacity;
        this.passengerQuantity = passengerQuantity;
        this.currentSpeed = currentSpeed;
    }

    public void changeCurrentSpeed(int newSpeed){
        currentSpeed = newSpeed;
        System.out.println("Now the current speed is: " + currentSpeed);
    }

    public void addOnePassenger() {
        if ((passengerQuantity + 1) <= passengerCapacity) {
            passengerQuantity++;
        } else {
            System.out.println("It is impossible to put 1 passenger. Exceeds the total number of passengers.");
        }
    }

    public void disembarkOnePassengerQuantity() {
        if (passengerQuantity > 0)
            passengerQuantity--;
        else
            System.out.println("It is impossible to disembark one passenger. The current number is 0.");
    }

    public void clearPassengerQuantity() {
        passengerQuantity = 0;
    }

    public CarDoor getIndexDoor(int indexDoor) {
        if (indexDoor < doors.length) {
            return doors[indexDoor];
        } else {
            System.out.println("The index exceeds the length of the array");
            return null;
        }
    }

    public CarWheel getIndexWheel(int indexWheel) {
        if (indexWheel < wheels.length) {
            return  wheels[indexWheel];
        } else {
            System.out.println("The index exceeds the length of the array");
            return null;
        }
    }

    public void removeAllWheels() {
        wheels = new CarWheel[0];
    }

    public void addNewWheelToCar(CarWheel tempWheel){
        CarWheel[] tempWheels = new CarWheel[wheels.length + 1];

        for (int i = 0; i < wheels.length; i++){
            tempWheels[i] = wheels[i];
        }
        tempWheels[tempWheels.length-1] = tempWheel;

        wheels = new CarWheel[tempWheels.length-1];
        wheels = tempWheels;
    }

    public double getMinWheelCondition() {
        if (wheels.length < 1 )
            return 0;

        double minCondition = wheels[0].getTireCondition();

        for (int i = 0; i < wheels.length; i++){
            if (wheels[i].getTireCondition() < minCondition)
                minCondition = wheels[i].getTireCondition();
        }
        return minCondition;
    }

    public double getCurrentMaxSpeed(){
//        if (passengerQuantity < 0) {
//            return ;
//        }
        return maxSpeed * getMinWheelCondition();
    }

    @Override
    public String toString() {
        return "Car-> " +
                "dataProduce: " + dataProduce +
                ", engineType: " + engineType +
                ", maxSpeed: " + maxSpeed +
                ", accelerationTimeTo100: " + accelerationTimeTo100 +
                ", passengerCapacity: " + passengerCapacity +
                ", passengerQuantity: " + passengerQuantity +
                ", currentSpeed: " + currentSpeed;

    }
}
