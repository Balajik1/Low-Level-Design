package org.example.WithStrategyDesignPattern;


import org.example.WithStrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(){
        super(new SpecialDriveStrategy());
    }

}
