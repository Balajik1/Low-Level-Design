package org.example.WithoutStrategyDesignPattern;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive(){
        // same as sport vehicle
        System.out.println("Special Drive Capability");
    }
}
