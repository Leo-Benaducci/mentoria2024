package br.com.lbenaducci;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private final List<Item> cardapio;
    private final List<Pagamento> formasDePagamento;
    private final List<Pedido> pedidos;

    public Restaurante(List<Item> cardapio, List<Pagamento> formasDePagamento) {
        this.cardapio = new ArrayList<>(cardapio);
        this.formasDePagamento = new ArrayList<>(formasDePagamento);
        this.pedidos = new ArrayList<>();
    }

    public void registrar(int numeroMesa, List<Item> itens) {
        Pedido pedido = new Pedido(numeroMesa, itens);
        pedidos.add(pedido);
    }

    // Sabe me explicar o que esta fazendo aqui? O que é uma stream? O que o filter faz? O que o findFirst faz?  O que o orElse faz?
    private Pedido encontrarPedidoPorMesa(int numeroMesa) {
        return pedidos.stream()
                .filter(pedido -> pedido.mesa() == numeroMesa)
                .findFirst()
                .orElse(null);
    }

    public void pagar(int numeroMesa, Pagamento pagamento) {
        Pedido pedido = encontrarPedidoPorMesa(numeroMesa);
        if(pedido != null) {
            pagamento.pagar(pedido);
            pedidos.remove(pedido);
        } else {
            throw new IllegalArgumentException("Pedido não encontrado para a mesa " + numeroMesa);
        }
    }

    public List<Item> getCardapio() {
        return cardapio;
    }

    public List<Pagamento> getFormasPagamento() {
        return formasDePagamento;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
