package br.com.lbenaducci;

public class Cartao implements Pagamento{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento com cartão realizado para o pedido" + pedido);
    }
}
