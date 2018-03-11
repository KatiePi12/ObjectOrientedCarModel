public class Main {

    public static void main(String[] args) {

        Car fuelCar = new Car(new FuelEngine());
        Car electricCar = new Car(new ElectricEngine());

        System.out.println("----------Behaviour of fuel car ------------");
        fuelCar.start();
        fuelCar.refuel();
        fuelCar.stop();
        fuelCar.refuel();
        System.out.println("----------Behaviour of electric car------------");
        electricCar.start();
        electricCar.refuel();
        electricCar.stop();
        electricCar.refuel();

        System.out.println("----------------Start, stop and go to place functionalities------------------");
        Car someCar = new Car(new FuelEngine());
        someCar.stop();
        someCar.start();
        someCar.start();
        someCar.stop();
        someCar.start();

        Place place = new Place("California");
        someCar.goToPlace(place);
        someCar.goToPlace(place);
        someCar.stop();
        someCar.goToPlace(place);
    }
}
