package br.com.lbenaducci;

public class Dinheiro implements  Pagamento{

    @Override
    public String pagar(Pedido pedido) {
        double valorTotal = pedido.valorTotal();
        return "Pagamento de R$" + valorTotal +" realizado no dinheiro";
    }
}
