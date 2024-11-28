package org.example.WithoutStrategyDesignPattern;

public class SportsVehicle extends  Vehicle{

    @Override
    public void drive(){
        // same as off-road Vehicle capability
        // duplicate code
        System.out.println("Special Drive capability");
    }
}
