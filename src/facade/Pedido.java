package facade;

import singleton.GerenciamentoPedido;
import strategy.Desconto;

public class Pedido {
    // singleton
    private GerenciamentoPedido pedido;

    public Pedido() {
        this.pedido = GerenciamentoPedido.getGerenciamento();
    }

    public void fazerPedido(double valorTotal, Desconto desconto) {
        // strategy
        double valorComDesconto = desconto.aplicarDesconto(valorTotal);
        System.out.println("O valor final de sua compra com desconto de " + desconto.getDesconto() + "% é: R$ " + valorComDesconto);
    }    
}
