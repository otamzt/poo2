public class Main {
    public static void main(String[] args) {
        // Usuário sem assinatura
        Video video1 = new ProxyVideo("Documentário sobre a Natureza", false);
        video1.assistir();

        // Usuário com assinatura
        Video video2 = new ProxyVideo("Filme de Ação", true);
        video2.assistir();
    }
}
