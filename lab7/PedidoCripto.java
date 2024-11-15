public class PedidoCripto extends Pedido {
    @Override
    protected void processarPagamento(double total) {
        System.out.println("Pagamento com criptomoedas processado. Total: R$" + total);
    }
}
