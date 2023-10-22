package strategy;

public class DescontoQuinzePorCento implements Desconto{

    private int desconto = 15;

    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal - (valorTotal * desconto / 100);
    }

    @Override
    public int getDesconto() {
        return desconto;
    }    
}
