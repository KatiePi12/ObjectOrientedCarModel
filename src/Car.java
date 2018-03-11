public class Car<T extends Engine> {

    private T engine;
    private boolean isStarted = false;
    private Place currentPlace = new Place("Home");

    public Car(T engine) {
        this.engine = engine;
    }

    public void start() {
        if(isStarted == false) {
            this.engine.start();
            isStarted = true;
            System.out.println("Car was started");
        }
        else
            System.out.println("Car has already been started");
    }

    public void stop() {
        if(isStarted == true) {
            this.engine.stop();
            isStarted = false;
            System.out.println("Car war stopped");
        }
        else
            System.out.println("Car has already been stopped");
    }

    public void refuel() {
        if(isStarted == false)
            this.engine.refuel();
        else
            System.out.println("To refuel the car, first stop it");
    }

    public void goToPlace(Place place){
        if(isStarted == true) {
            if (!currentPlace.equals(place)) {
                Place previousPlace = currentPlace;
                currentPlace = place;
                System.out.println("Car went to the " + currentPlace.getName() + " from " + previousPlace.getName());
            } else
                System.out.println("Car is already in " + currentPlace.getName());
        }
        else
            System.out.println("First, start the car");
    }
}
