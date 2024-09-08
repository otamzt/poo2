package vehicle;

public class Civic implements IVehicle {
    @Override
    public void start() {
        System.out.println("Civic está ligando.");
    }

    @Override
    public void drive() {
        System.out.println("Civic está dirigindo.");
    }

    @Override
    public void stop() {
        System.out.println("Civic está parando.");
    }
}
