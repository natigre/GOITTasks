package com.mazurnata.hometasks.module05.useCar;

public class CarWheel {

    private double tireCondition;

    public CarWheel() {
        this(1.0);
    }

    public CarWheel(double tireCondition) {
        this.tireCondition = tireCondition;
    }

    public void changeTireOnNew() {
        tireCondition = 1.0;
    }

    public void eraseTheTireByPercent(double percent) {
        if (tireCondition - (tireCondition * percent / 100) > 0) {
            this.tireCondition -= (tireCondition * percent / 100);
        } else {
            this.tireCondition = 0;
        }
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
