package com.bilgeadam.week6.lesson1.hw.engine;

public class Engine
{
    private String enginePower;
    private String engineVolume;
    private FuelType fuelType;
    private final int DEFAULT_ENGINEPOWER=0;
    private final int DEFAULT_ENGINEVOLUME=0;

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower='" + enginePower + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", fuelType=" + fuelType +
                ", DEFAULT_ENGINEPOWER=" + DEFAULT_ENGINEPOWER +
                ", DEFAULT_ENGINEVOLUME=" + DEFAULT_ENGINEVOLUME +
                '}';
    }

    public Engine(String enginePower, String engineVolume, FuelType fuelType) {
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }


    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getDEFAULT_ENGINEPOWER() {
        return DEFAULT_ENGINEPOWER;
    }

    public int getDEFAULT_ENGINEVOLUME() {
        return DEFAULT_ENGINEVOLUME;
    }


}
