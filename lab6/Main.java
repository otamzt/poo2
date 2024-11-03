public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("Acao XYZ", 100.0);
        AcaoBroker broker = new AcaoBroker();

        InvestidorConcreto investidor1 = new InvestidorConcreto("João", 120.0, 80.0);
        InvestidorConcreto investidor2 = new InvestidorConcreto("Maria", 110.0, 90.0);

        investidor1.setAcaoBroker(broker);
        investidor2.setAcaoBroker(broker);

        acao.adicionarInvestidor(investidor1);
        acao.adicionarInvestidor(investidor2);

        acao.setPreco(125.0); // Notifica os investidores e vende se necessário
        acao.setPreco(85.0);  // Apenas notifica
    }
}
