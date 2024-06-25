package br.com.lbenaducci;

public class Cartao implements Pagamento {

    // Esta recriando a regra para obter o valor do pedido, isso pode gerar problemas em uma possivel mudança no futuro
    @Override
    public String pagar(Pedido pedido) {
        double total = pedido.itens().stream().mapToDouble(Item::getPreco).sum();
        return "Pagamento de R$" + total + " realizado no cartão";

    }
}
