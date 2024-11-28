package org.example.WithStrategyDesignPattern;

import org.example.WithStrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
