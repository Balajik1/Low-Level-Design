package org.example.WithStrategyDesignPattern;


import org.example.WithStrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
