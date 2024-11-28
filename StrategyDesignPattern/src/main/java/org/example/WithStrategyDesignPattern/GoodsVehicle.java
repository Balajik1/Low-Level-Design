package org.example.WithStrategyDesignPattern;


import org.example.WithStrategyDesignPattern.Strategy.NormalDriveStrategy;
import org.example.WithStrategyDesignPattern.Strategy.SpecialDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }

}
