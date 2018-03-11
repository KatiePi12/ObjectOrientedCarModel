public class FuelEngine extends Engine {
    @Override
    public void start() {
        System.out.println("Fuel engine started");
    }

    @Override
    public void stop() {
        System.out.println("Fuel engine turned off");
    }

    @Override
    public void refuel() {
        System.out.println("Tank got filled");
    }
}
