package com.bilgeadam.week6.lesson1.hw.motorlandvehicles;

import com.bilgeadam.week6.lesson1.hw.engine.Engine;
import com.bilgeadam.week6.lesson1.hw.engine.FuelType;
import com.bilgeadam.week6.lesson1.hw.motorwatervehicles.Sail;
import com.bilgeadam.week6.lesson1.hw.motorwatervehicles.Yacth;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("06 COM 769",4,4);
        System.out.println(car1);
        System.out.println("================");
        Engine engine = new Engine("150hp","1599cc", FuelType.diesel);
        engine.setEnginePower("190hp");
        System.out.println("================");
        System.out.println(engine);
        System.out.println("================");
        Sail sail1 = new Sail(1,3,1,"Turkey","Wood",0,"one person");
        System.out.println(sail1);
        sail1.setHullMaterial("Carbon Fiber");
        System.out.println(sail1);
        System.out.println("================");
        Yacth yacth1 = new Yacth(5,32,5,"England","Carbon Fiber",4,6,"Rolls Royce");
        System.out.println(yacth1);

        /*
        ask that I add that properties to inside that toString, why it's not define automatic
        */
    }
}
