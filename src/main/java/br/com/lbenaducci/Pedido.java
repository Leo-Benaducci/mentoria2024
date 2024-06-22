package br.com.lbenaducci;

import java.util.List;

public record Pedido(int numeroMesa, List<Item> itens) {

    public double valorTotal() {
        // Calcular o valor total somando os preços de todos os itens
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }

    public int mesa() {
        return numeroMesa;
    }
}




