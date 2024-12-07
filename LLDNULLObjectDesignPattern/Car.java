public class Car implements  Vehicle{
    @Override
    public int getSeatCapacity() {
        return 4;
    }

    @Override
    public int getTankCapacity() {
        return 40;
    }
}
