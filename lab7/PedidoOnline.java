public class PedidoOnline extends Pedido {
    @Override
    protected void processarPagamento(double total) {
        System.out.println("Pagamento online processado. Total: R$" + total);
    }
}
