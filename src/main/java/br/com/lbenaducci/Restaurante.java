package br.com.lbenaducci;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Item> cardapio;
    private List<Pagamento> formasPagamento;
    private List<Pedido> pedidos;

    public Restaurante(List<Item> cardapio, List<Pagamento> formasPagamento) {
        this.cardapio = cardapio;
        this.formasPagamento = formasPagamento;
        this.pedidos = new ArrayList<Pedido>(); // Inicialização do ArrayList com genérico declarado, eu expliquei que isso é redundante durante as aulas
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

    public void registrar(int mesa, List<Item> Itens) {
        Pedido pedido = new Pedido(mesa, Itens);
        pedidos.add(pedido);
    }

    // Não ta usando a forma de pagamento, voce só quis passar nos testes, não pensou na regra de negócio de um restaurante.
    public void pagar(int mesa, Pagamento formasPagamento) {
        Pedido pedidoParaPagar =null;
        for (Pedido pedido : pedidos) {
            if (pedido.mesa() == mesa){
                pedidoParaPagar = pedido;
                break;
            }
        }
        if (pedidoParaPagar != null) {
            pedidos.remove(pedidoParaPagar);
        }
    }
}
