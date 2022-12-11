package com.bilgeadam.week6.lesson1.hw.motorwatervehicles;

public abstract class MotorWaterVehicles {
    private int numberOfEngine;
    private int width;
    private int height;
    private String registry;
    private String hullMaterial;
    private int numberOfCabin;

    public void setNumberOfEngine(int numberOfEngine) {
        this.numberOfEngine = numberOfEngine;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public void setNumberOfCabin(int numberOfCabin) {
        this.numberOfCabin = numberOfCabin;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getRegistry() {
        return registry;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public int getNumberOfCabin() {
        return numberOfCabin;
    }

    public MotorWaterVehicles(int numberOfEngine, int width, int height, String registry, String hullMaterial, int numberOfCabin) {
        this.numberOfEngine = numberOfEngine;
        this.width = width;
        this.height = height;
        this.registry = registry;
        this.hullMaterial = hullMaterial;
        this.numberOfCabin = numberOfCabin;

    }

    @Override
    public String toString() {
        return "MotorWaterVehicles{" +
                "numberOfEngine=" + numberOfEngine +
                ", width=" + width +
                ", height=" + height +
                ", registry='" + registry + '\'' +
                ", hullMaterial='" + hullMaterial + '\'' +
                ", numberOfCabin=" + numberOfCabin +
                '}';
    }
}
