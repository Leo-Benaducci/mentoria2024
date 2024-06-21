package br.com.lbenaducci;

@FunctionalInterface
public interface Pagamento {

    String pagar(Pedido pedido);
}
