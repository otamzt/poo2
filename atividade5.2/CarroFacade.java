public class CarroFacade {
    private Motor motor;
    private CintoSeguranca cinto;
    private Porta portas;
    private Farol farol;
    private Radio radio;

    public CarroFacade() {
        this.motor = new Motor();
        this.cinto = new CintoSeguranca();
        this.portas = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void iniciarViagem(String estacaoPreferida) {
        motor.ligar();
        portas.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoPreferida);
        System.out.println("Carro pronto para a viagem!");
    }

    public void finalizarViagem() {
        motor.desligar();
        portas.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("Viagem finalizada e carro desligado.");
    }
}
