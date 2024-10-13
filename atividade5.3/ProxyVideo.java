public class ProxyVideo implements Video {
    private VideoReal videoReal;
    private boolean usuarioAssinante;

    public ProxyVideo(String titulo, boolean usuarioAssinante) {
        this.videoReal = new VideoReal(titulo);
        this.usuarioAssinante = usuarioAssinante;
    }

    @Override
    public void assistir() {
        if (usuarioAssinante) {
            videoReal.assistir();
        } else {
            System.out.println("Acesso negado. Assine o serviço para assistir ao vídeo.");
        }
    }
}
