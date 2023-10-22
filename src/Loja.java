import facade.Pedido;
import strategy.Desconto;
import strategy.DescontoDezPorCento;
import strategy.DescontoQuinzePorCento;

public class Loja {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        Desconto descontoDezPorCento = new DescontoDezPorCento();
        Desconto descontoQuinzePorCento = new DescontoQuinzePorCento();

        pedido.fazerPedido(1000d, descontoDezPorCento);
        pedido.fazerPedido(1000d, descontoQuinzePorCento);
    }
}
