public class Main {
    public static void main(String[] args) {
        Pedido pedidoOnline = new PedidoOnline();
        pedidoOnline.processarPedido(2, 150.0);

        Pedido pedidoNaLoja = new PedidoNaLoja();
        pedidoNaLoja.processarPedido(3, 100.0);

        Pedido pedidoCripto = new PedidoCripto();
        pedidoCripto.processarPedido(1, 300.0);
    }
}
