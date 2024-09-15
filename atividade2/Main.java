public class Main {
    public static void main(String[] args) {
        Ave patoDomestico = new PatoDomestico();
        System.out.println("Pato Doméstico:");
        patoDomestico.voar();
        patoDomestico.emitirSom();
        
        Ave pavaoAzul = new PavaoAzul();
        System.out.println("\nPavão Azul:");
        pavaoAzul.voar();
        pavaoAzul.emitirSom();

        Ave pavaoAzulAdaptado = new PavaoVoadorAdapter(new PavaoAzul());
        System.out.println("\nPavão Azul Adaptado:");
        pavaoAzulAdaptado.voar();
        pavaoAzulAdaptado.emitirSom();
    }
}
