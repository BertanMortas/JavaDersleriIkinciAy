package com.bilgeadam.week6.lesson1.hw.motorwatervehicles;

public class Sail extends MotorWaterVehicles{

    private String type;
    private MotorWaterVehicles motorWaterVehicles;



    public Sail(int numberOfEngine, int width, int height, String registry, String hullMaterial, int numberOfCabin, String type) {
        super(numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.type = type;
    }
    @Override
    public String toString() {
        return "Sail{" +
                "type='" + type + '\'' +
                "numberOfEngine=" + getNumberOfEngine() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", registry='" + getRegistry() + '\'' +
                ", hullMaterial='" + getHullMaterial() + '\'' +
                ", numberOfCabin=" + getNumberOfCabin() +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
