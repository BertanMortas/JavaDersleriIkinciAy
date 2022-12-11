package com.bilgeadam.week6.lesson1.hw.motorwatervehicles;

public class Yacth extends MotorWaterVehicles{
    private int numberOfBeds;
    private String engineBrand;

    public Yacth(int numberOfEngine, int width, int height, String registry, String hullMaterial, int numberOfCabin, int numberOfBeds, String engineBrand) {
        super(numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.numberOfBeds = numberOfBeds;
        this.engineBrand = engineBrand;
    }

    @Override
    public String toString() {
        return "Yacth{" +
                "numberOfBeds=" + numberOfBeds +
                ", engineBrand='" + engineBrand + '\'' +
                "numberOfEngine=" + getNumberOfEngine() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", registry='" + getRegistry() + '\'' +
                ", hullMaterial='" + getHullMaterial() + '\'' +
                ", numberOfCabin=" + getNumberOfCabin() +
                '}';
    }
}
