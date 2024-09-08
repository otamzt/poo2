public class Galaxy20 implements Celular {
    @Override
    public void fazLigacao() {
        System.out.println("Ligação feita com o Galaxy 20.");
    }

    @Override
    public void tirarFoto() {
        System.out.println("Foto tirada com o Galaxy 20.");
    }

    @Override
    public String getModelo() {
        return "Galaxy 20";
    }
}
