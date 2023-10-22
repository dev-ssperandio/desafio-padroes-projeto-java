package facade;

import singleton.GerenciamentoPedidos;
import strategy.Desconto;

public class Pedido {
    private GerenciamentoPedidos pedido;

    public Pedido() {
        this.pedido = GerenciamentoPedidos.getGerenciamento();
    }

    public void fazerPedido(double valorTotal, Desconto desconto) {
        double valorComDesconto = desconto.aplicarDesconto(valorTotal);
        System.out.println("O valor final de sua compra com desconto de " + desconto.getDesconto() + "% é: R$ " + valorComDesconto);
    }    
}
