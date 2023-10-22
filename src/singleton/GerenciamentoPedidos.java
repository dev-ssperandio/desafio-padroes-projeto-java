package singleton;

public class GerenciamentoPedidos {

    private static class Instancia {
        public static GerenciamentoPedidos gerenciamento = new GerenciamentoPedidos();
    }

    private GerenciamentoPedidos() {
        super();
    }

    public static GerenciamentoPedidos getGerenciamento() {
        return Instancia.gerenciamento;
    }
}