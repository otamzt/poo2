package vehicle;

public class Honda implements IVehicleMaker {
    private static Honda instance;

    private Honda() {}

    public static Honda getInstance() {
        if (instance == null) {
            instance = new Honda();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo) {
            case "City":
                return new City();
            case "Civic":
                return new Civic();
            case "Fit":
                return new Fit();
            default:
                return null;
        }
    }
}
