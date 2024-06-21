package br.com.lbenaducci;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Item> cardapio;
    private List<Pedido> pedidos;
    private List<Pagamento> formasPagamento;

    public Restaurante(List<Item> cardapio, List<Pagamento> formasPagamento) {
        this.cardapio = cardapio;
        this.formasPagamento = formasPagamento;
        this.pedidos = new ArrayList<>();
    }

    public List<Item> getCardapio(){
        return cardapio;
    }

    public List<Pagamento> getFormasPagamento(){
        return formasPagamento;
    }

    public List<Pedido> getPedidos(){
        return pedidos;
    }

    public void registrar(int mesa, List<Item> itens){
        Pedido pedido = new Pedido(mesa, itens);
        pedidos.add(pedido);
    }

    public void pagar(int mesa, Pagamento formasPagamento){
        Pedido pedido = null;
        for(Pedido p : pedidos) {
            if(p.mesa() == mesa) {
                pedido = p;
                break;
            }
        }
        if(pedido != null){
            formasPagamento.pagar(pedido);
            pedidos.remove(pedido);
        }
    }
}
