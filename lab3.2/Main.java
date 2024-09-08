package vehicle;

public class Main {
    public static void main(String[] args) {
        IVehicleMaker toyota = Toyota.getInstance();
        IVehicleMaker honda = Honda.getInstance();

        IVehicle corolla = toyota.makeVehicle("Corolla");
        IVehicle hilux = toyota.makeVehicle("Hilux");
        IVehicle etios = toyota.makeVehicle("Etios");

        testVehicle(corolla);
        testVehicle(hilux);
        testVehicle(etios);

        IVehicle city = honda.makeVehicle("City");
        IVehicle civic = honda.makeVehicle("Civic");
        IVehicle fit = honda.makeVehicle("Fit");

        testVehicle(city);
        testVehicle(civic);
        testVehicle(fit);
    }

    private static void testVehicle(IVehicle vehicle) {
        if (vehicle != null) {
            vehicle.start();
            vehicle.drive();
            vehicle.stop();
        } else {
            System.out.println("Modelo de veículo não encontrado.");
        }
    }
}
