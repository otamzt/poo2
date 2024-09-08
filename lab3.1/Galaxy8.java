public class Galaxy8 implements Celular {
    @Override
    public void fazLigacao() {
        System.out.println("Ligação feita com o Galaxy 8.");
    }

    @Override
    public void tirarFoto() {
        System.out.println("Foto tirada com o Galaxy 8.");
    }

    @Override
    public String getModelo() {
        return "Galaxy 8";
    }
}
