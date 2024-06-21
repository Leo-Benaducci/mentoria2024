package br.com.lbenaducci;

public class Dinheiro implements  Pagamento{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento realizado em dinheiro para o pedido " + pedido);
    }
}
