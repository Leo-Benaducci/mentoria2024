package br.com.lbenaducci;

import java.util.List;

public record Pedido(int mesa, List<Item> itens) {

    // Sabe me explicar o que esta fazendo aqui? O que é uma stream? O que o map faz? EXPLICADO
    // Saberia adicionar desconto de 10% em itens do tipo bebida e 5% em itens do tipo sobremesa.

    public double valorTotal() {
        // Calcular o valor total somando os preços de todos os itens
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }
}
    // Poderia ter colocado o nome do atributo de mesa no lugar de criar um metodo que retorna seu atributo com outro nome
    //FEITO, COLOQUEI ALI DEPOIS DE Pedido(int "mesa"...)





