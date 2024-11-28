package org.example.WithoutStrategyDesignPattern;

public class Main {
    public static void Main(String[] args){
        Vehicle  sportsVehicle1=new SportsVehicle();
        Vehicle passengerVehicle1=new PassengerVehicle();
        Vehicle offRoadVehicle1=new OffRoadVehicle();

        sportsVehicle1.drive();
        passengerVehicle1.drive();
        offRoadVehicle1.drive();
    }
}
