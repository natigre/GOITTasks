package com.mazurnata.hometasks.module05;

public class CarDoor {
    private boolean door;   // open - true
    private boolean window; // open - true

    public CarDoor() {
        this(true, true);
    }

    public CarDoor(boolean door, boolean window) {
        this.door = door;
        this.window = window;
    }

    public void openDoor() { //open the door
        this.door = true;
    }

    public void closeDoor() { //close the door
        this.door = false;
    }

    public void checkConditionOfTheDoor() {  //
        door = (door) ? false : true;
    }

    

}
