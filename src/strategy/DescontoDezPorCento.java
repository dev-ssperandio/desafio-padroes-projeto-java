package strategy;

public class DescontoDezPorCento implements Desconto{
    
    private int desconto = 10;

    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal - (valorTotal * desconto / 100);
    }

    @Override
    public int getDesconto() {
        return desconto;
    }
}
