import facade.Pedido;
import strategy.Desconto;
import strategy.DescontoDezPorCento;
import strategy.DescontoQuinzePorCento;

public class Loja {
    public static void main(String[] args) {
        // strategy
        Desconto descontoDezPorCento = new DescontoDezPorCento();
        Desconto descontoQuinzePorCento = new DescontoQuinzePorCento();

        // facade
        Pedido pedido = new Pedido();
        pedido.fazerPedido(1000d, descontoDezPorCento);
        pedido.fazerPedido(1000d, descontoQuinzePorCento);
    }
}
