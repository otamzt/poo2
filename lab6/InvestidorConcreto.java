public class InvestidorConcreto implements Investidor {
    private String nome;
    private double limiteMaximo;
    private double limiteMinimo;
    private AcaoBroker broker;

    public InvestidorConcreto(String nome, double limiteMaximo, double limiteMinimo) {
        this.nome = nome;
        this.limiteMaximo = limiteMaximo;
        this.limiteMinimo = limiteMinimo;
    }

    @Override
    public void atualizar(double preco) {
        System.out.println("Investidor " + nome + " notificado do novo preço: " + preco);
        if (preco >= limiteMaximo) {
            System.out.println("Investidor " + nome + " atingiu o preço máximo e vende suas ações!");
            if (broker != null) {
                broker.venderAcoes();
            }
        }
    }

    @Override
    public double getLimiteMaximo() {
        return limiteMaximo;
    }

    @Override
    public double getLimiteMinimo() {
        return limiteMinimo;
    }

    @Override
    public void setAcaoBroker(AcaoBroker broker) {
        this.broker = broker;
    }
}
