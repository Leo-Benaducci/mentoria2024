package br.com.lbenaducci;

import java.util.List;

public record Pedido(int mesa, List<Item> itens, double valorTotal) {
}
