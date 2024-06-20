package br.com.lbenaducci;
import java.util.List;

public class Combo extends Item{

    private final String nome;
    private final double preco;
    private final Categoria categoria;
    private final List<Item> itens;

    public Combo(String nome, double preco, List<Item> itens) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = Categoria.COMBO;
        this.itens = itens;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    public List<Item> getItens() {
        return itens;
    }

}
