public class FabricanteCelularSingleton {
    private static Apple apple;
    private static Samsung samsung;

    public static Apple getAppleInstance() {
        if (apple == null) {
            apple = new Apple();
        }
        return apple;
    }

    public static Samsung getSamsungInstance() {
        if (samsung == null) {
            samsung = new Samsung();
        }
        return samsung;
    }
}
