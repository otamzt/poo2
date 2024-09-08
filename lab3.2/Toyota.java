package vehicle;

public class Toyota implements IVehicleMaker {
    private static Toyota instance;

    private Toyota() {}

    public static Toyota getInstance() {
        if (instance == null) {
            instance = new Toyota();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo) {
            case "Corolla":
                return new Corolla();
            case "Hilux":
                return new Hilux();
            case "Etios":
                return new Etios();
            default:
                return null;
        }
    }
}
