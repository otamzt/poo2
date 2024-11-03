import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String nome;
    private double preco;
    private List<Investidor> investidores;

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.investidores = new ArrayList<>();
    }

    public void adicionarInvestidor(Investidor investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remove(investidor);
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarInvestidores();
    }

    private void notificarInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.atualizar(preco);
        }
    }
}
