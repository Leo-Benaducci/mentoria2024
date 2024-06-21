package br.com.lbenaducci;

import java.util.List;

public class Combo extends Item{

    private List<Item> itens;

    public Combo(String nome, double preco, List<Item> itens) {
        super(nome, preco, Categoria.COMBO);
        this.itens = itens;
    }

    @Override
    public String descricao() {
        return "Combo itens " + itens;
    }

    public List<Item> getItens() {
        return itens;
    }
}
