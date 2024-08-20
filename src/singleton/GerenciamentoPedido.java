package singleton;

public class GerenciamentoPedido {

    private static class Instancia {
        public static GerenciamentoPedido gerenciamento = new GerenciamentoPedido();
    }

    private GerenciamentoPedido() {
        super();
    }

    public static GerenciamentoPedido getGerenciamento() {
        return Instancia.gerenciamento;
    }
}