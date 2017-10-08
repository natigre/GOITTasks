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
        if (tireCondition >= 0 && tireCondition <= 1) {
            tireCondition = 1.0;
        }
        System.out.println("It is necessary to replace the wheel with a new one");
    }

    public void eraseTheTireByPercent(double percent) {
        if (tireCondition - (tireCondition * percent / 100) > 0) {
            tireCondition -= (tireCondition * percent / 100);
            System.out.println("Our tire is worn out on" + percent+ "% and now has a state of erasure " + tireCondition);
        } else {
            tireCondition = 0;

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
