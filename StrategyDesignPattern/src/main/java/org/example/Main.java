package org.example;


import org.example.WithStrategyDesignPattern.GoodsVehicle;
import org.example.WithStrategyDesignPattern.OffRoadVehicle;
import org.example.WithStrategyDesignPattern.Strategy.NormalDriveStrategy;
import org.example.WithStrategyDesignPattern.Vehicle;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Vehicle offroadVehicle1=new OffRoadVehicle();
        Vehicle goodsVehicle=new GoodsVehicle();
        offroadVehicle1.drive();
        goodsVehicle.drive();
    }
}