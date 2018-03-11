public class ElectricEngine extends Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine turned off");
    }

    @Override
    public void refuel() {
        System.out.println("Electric battery was loaded");
    }
}
