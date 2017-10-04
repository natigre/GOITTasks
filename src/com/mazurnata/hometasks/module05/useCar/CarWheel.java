package com.mazurnata.hometasks.module05.useCar;

public class CarWheel {

    private double tireCondition;

    public CarWheel() {

    }

    public CarWheel(double tireCondition) {
        this.tireCondition = tireCondition;
    }


    public double getTireCondition() {
        return tireCondition;
    }

    public void setTireCondition(double tireCondition) {
        this.tireCondition = tireCondition;
    }

    @Override
    public String toString() {
        return "CarWheel " +
                "tireCondition: " + tireCondition;
    }
}
