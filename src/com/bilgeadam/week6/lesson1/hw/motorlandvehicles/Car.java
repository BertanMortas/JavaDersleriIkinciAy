package com.bilgeadam.week6.lesson1.hw.motorlandvehicles;

public class Car extends MotorLandVehicle{

    private int numberOfDoors;

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors + " lisancePlate= " +
                getLisancePlate()+" number of wheels= "+ getNumberOfWheels()+
                '}';
    }

    public Car(String lisancePlate, int numberOfWheels, int numberOfDoors) {
        super(lisancePlate, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }
}
