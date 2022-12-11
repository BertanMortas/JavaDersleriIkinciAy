package com.bilgeadam.week6.lesson1.hw.engine;

public class MotorVehicle {
    private String brand;
    private int year;
    private Engine engine;

    public MotorVehicle(String brand, int year, Engine engine) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }
}
