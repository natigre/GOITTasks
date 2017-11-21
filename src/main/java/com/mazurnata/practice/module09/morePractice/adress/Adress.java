package com.mazurnata.practice.module09.morePractice.adress;

public class Adress {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Adress(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" +
                city + "\n" + state + "\n" + code;
    }
}
