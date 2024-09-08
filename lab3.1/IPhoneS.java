public class IPhoneS implements Celular {
    @Override
    public void fazLigacao() {
        System.out.println("Toque do iPhone S.");
    }

    @Override
    public void tirarFoto() {
        System.out.println("Foto do iPhone S.");
    }

    @Override
    public String getModelo() {
        return "IPhoneS";
    }
}
