public class Apple implements FabricanteCelular {
    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equals("IPhoneS")) {
            return new IPhoneS();
        } else if (modelo.equals("IPhoneX")) {
            return new IPhoneX();
        } else {
            return null;
        }
    }
}
