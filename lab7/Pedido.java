
public abstract class Pedido {
    public final void processarPedido(int quantidade, double valorUnitario) {
        double total = calcularValor(quantidade, valorUnitario);
        processarPagamento(total);
        if (necessitaEntrega()) {
            realizarEntrega();
        }
    }

    private double calcularValor(int quantidade, double valorUnitario) {
        return quantidade * valorUnitario;
    }

    protected abstract void processarPagamento(double total);

    protected boolean necessitaEntrega() {
        return true;
    }

    protected void realizarEntrega() {
        System.out.println("Entrega realizada com sucesso.");
    }
}
