package br.com.lbenaducci;

import java.util.List;

public class Combo extends Item{
    private String nome;
    private double preco;
    private Categoria categoria;
    private List<Item> itens;

    public Combo(String nome, double preco, List<Item> itens) {
        this.nome = nome;
        this.preco = preco;
        this.itens = itens;
        this.categoria = Categoria.COMBO;
    }

    @Override
    String getNome() {
        return nome;
    }

    @Override
    double getPreco() {
        return preco;
    }

    @Override
    Categoria getCategoria() {
        return categoria;
    }

   public List<Item> getItens() {
        return itens;
   }
}
