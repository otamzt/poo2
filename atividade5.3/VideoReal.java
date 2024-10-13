public class VideoReal implements Video {
    private String titulo;

    public VideoReal(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void assistir() {
        System.out.println("Assistindo ao vídeo: " + titulo);
    }
}
