package com.mazurnata.hometasks.module05;

public class CarDoor {
    private boolean isDoorOpen;   // open - true
    private boolean isWindowOpen; // open - true

    public CarDoor() {
        this.isDoorOpen = false;
        this.isWindowOpen = false;
    }

    public CarDoor(boolean isDoorOpen, boolean isWindowOpen) {
        this.isDoorOpen = isDoorOpen;
        this.isWindowOpen = isWindowOpen;
    }

    public void openDoor() { //open the isDoorOpen
        this.isDoorOpen = true;
    }

    public void closeDoor() { //close the isDoorOpen
        this.isDoorOpen = false;
    }

    public void checkConditionOfTheDoor() {  //
        isDoorOpen = !isDoorOpen;
    }

    public void openWindow() {
        this.isWindowOpen = true;
    }

    public void closeWindow() {
        this.isWindowOpen = false;
    }

    public void checkConditionOfTheWindow() {
        isWindowOpen = !isWindowOpen;
    }

    @Override
    public String toString() {
        return "CarDoor " +
                "isDoorOpen: " + isDoorOpen +
                ", isWindowOpen: " + isWindowOpen;
    }
}
