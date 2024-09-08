public class Main {
    public static void main(String[] args) {
        FabricanteCelular apple = FabricanteCelularSingleton.getAppleInstance();
        FabricanteCelular samsung = FabricanteCelularSingleton.getSamsungInstance();

        Celular iphoneS = apple.constroiCelular("IPhoneS");
        Celular iphoneX = apple.constroiCelular("IPhoneX");

        if (iphoneS != null) {
            iphoneS.fazLigacao();
            iphoneS.tirarFoto();
            System.out.println("Modelo: " + iphoneS.getModelo());
        } else {
            System.out.println("Modelo IPhoneS não encontrado.");
        }

        if (iphoneX != null) {
            iphoneX.fazLigacao();
            iphoneX.tirarFoto();
            System.out.println("Modelo: " + iphoneX.getModelo());
        } else {
            System.out.println("Modelo IPhoneX não encontrado.");
        }

        Celular galaxy8 = samsung.constroiCelular("Galaxy8");
        Celular galaxy20 = samsung.constroiCelular("Galaxy20");

        if (galaxy8 != null) {
            galaxy8.fazLigacao();
            galaxy8.tirarFoto();
            System.out.println("Modelo: " + galaxy8.getModelo());
        } else {
            System.out.println("Modelo Galaxy8 não encontrado.");
        }

        if (galaxy20 != null) {
            galaxy20.fazLigacao();
            galaxy20.tirarFoto();
            System.out.println("Modelo: " + galaxy20.getModelo());
        } else {
            System.out.println("Modelo Galaxy20 não encontrado.");
        }
    }
}
