package br.com.lbenaducci;

public class Pix implements Pagamento{

    @Override
    public String pagar(Pedido pedido) {
        double valorTotal = pedido.valorTotal();
        return "Pagamento de R$" + valorTotal +" realizado no Pix";
    }
}
