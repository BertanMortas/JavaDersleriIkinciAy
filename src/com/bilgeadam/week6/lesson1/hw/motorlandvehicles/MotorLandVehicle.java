package com.bilgeadam.week6.lesson1.hw.motorlandvehicles;

public abstract class MotorLandVehicle {
    private String lisancePlate;
    private int numberOfWheels;

    @Override
    public String toString() {
        return "MotorLandVehicle{" +
                "lisancePlate='" + lisancePlate + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }

    public MotorLandVehicle(String lisancePlate, int numberOfWheels) {
        this.lisancePlate = lisancePlate;
        this.numberOfWheels = numberOfWheels;
    }

    public void setLisancePlate(String lisancePlate) {
        this.lisancePlate = lisancePlate;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getLisancePlate() {
        return lisancePlate;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
