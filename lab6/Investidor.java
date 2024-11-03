public interface Investidor {
    void atualizar(double preco);
    double getLimiteMaximo();
    double getLimiteMinimo();
    void setAcaoBroker(AcaoBroker broker);
}
