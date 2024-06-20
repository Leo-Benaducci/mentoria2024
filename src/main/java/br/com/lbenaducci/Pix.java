package br.com.lbenaducci;

public class Pix implements Pagamento{

    @Override
    public String pagar(Pedido pedido) {
        double total = pedido.itens().stream().mapToDouble(Item::getPreco).sum();
        return "Pagamento de R$" + total + " realizado no Pix";

    }

}
