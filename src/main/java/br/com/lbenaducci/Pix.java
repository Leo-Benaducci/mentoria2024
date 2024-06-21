package br.com.lbenaducci;

public class Pix implements Pagamento{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento realizado com pix para o pedido " + pedido);
    }
}
