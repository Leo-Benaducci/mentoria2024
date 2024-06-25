package br.com.lbenaducci;
import java.util.List;


public record Pedido(int mesa, List<Item> itens) {

    // Sabe me explicar o que esta fazendo aqui? O que é uma stream? O que o map faz?
    // Saberia adicionar desconto de 10% em itens do tipo bebida e 5% em itens do tipo sobremesa.
    public double valorTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }
}
