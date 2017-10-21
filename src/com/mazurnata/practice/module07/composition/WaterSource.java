package com.mazurnata.practice.module07.composition;

class WaterSource {
    private String s;

     WaterSource() {
         System.out.println("WaterSource() ");
         s = "сконструирован";
    }

    @Override
    public String toString() {
        return s;
    }
}
