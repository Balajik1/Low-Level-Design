public class VehicleFactory {

    public Vehicle getVehicleObject(String type){

        if(type.equalsIgnoreCase("car")){
            return new Car();
        }
        return  new NullObject();
    }
}
