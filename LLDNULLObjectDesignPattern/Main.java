public class Main {
    public static void main(String[] args){
        VehicleFactory vehicleFactory=new VehicleFactory();

        Vehicle car=vehicleFactory.getVehicleObject("car");
        Vehicle bike=vehicleFactory.getVehicleObject("Bike");

        printVehicleDetails(car);
        printVehicleDetails(bike);
    }
    public static void printVehicleDetails(Vehicle vehicle){
        System.out.println("vehicle Seating Capacity : "+vehicle.getSeatCapacity());
        System.out.println("vehicle Tank Capacity : "+vehicle.getTankCapacity());
    }
}
