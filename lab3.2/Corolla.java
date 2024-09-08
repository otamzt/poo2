package vehicle;

public class Corolla implements IVehicle {
    @Override
    public void start() {
        System.out.println("Corolla está ligando.");
    }

    @Override
    public void drive() {
        System.out.println("Corolla está dirigindo.");
    }

    @Override
    public void stop() {
        System.out.println("Corolla está parando.");
    }
}
