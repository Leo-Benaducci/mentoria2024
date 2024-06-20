package br.com.lbenaducci;

public class Prato extends Item{

    private final String nome;
    private final double preco;
    private final Categoria categoria;
    private final String descricao;

    public Prato(String nome, double preco, Categoria categoria, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }
}
