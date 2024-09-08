public class IPhoneX implements Celular {
    @Override
    public void fazLigacao() {
        System.out.println("Toque do iPhone X.");
    }

    @Override
    public void tirarFoto() {
        System.out.println("Foto do iPhone X.");
    }

    @Override
    public String getModelo() {
        return "IPhoneX";
    }
}
