package br.com.lbenaducci;

import java.util.List;

public record Pedido(int mesa, List<Item> itens) {

    public double valorTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }
}
