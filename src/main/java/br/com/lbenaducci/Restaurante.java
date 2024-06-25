package br.com.lbenaducci;

import java.util.LinkedList;
import java.util.List;

public class Restaurante {
    private final List<Item> cardapio;
    private final List<Pagamento> formasPagamento;
    private final List<Pedido> pedidos;

    public Restaurante(List<Item> cardapio, List<Pagamento> formasPagamento) {
        this.cardapio = cardapio;
        this.formasPagamento = formasPagamento;
        this.pedidos = new LinkedList<>();
    }

    public List<Item> getCardapio() {
        return cardapio;
    }

    public List<Pagamento> getFormasPagamento() {
        return formasPagamento;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void registrar(int mesa, List<Item> itens) {
        Pedido pedido = new Pedido(mesa, itens);
        pedidos.add(pedido);
    }

    // Não ta usando a forma de pagamento, voce só quis passar nos testes, não pensou na regra de negócio de um restaurante.
    public void pagar(int mesa, Pagamento formaPagamento) {
        Pedido pedidoParaPagar = null;
        for (Pedido pedido : pedidos) {
            if (pedido.mesa() == mesa) {
                pedidoParaPagar = pedido;
                break;
            }
        }
        if (pedidoParaPagar != null) {
            pedidos.remove(pedidoParaPagar);
        }
    }
}