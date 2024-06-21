package br.com.lbenaducci;

public class Prato extends Item {
    private String nome;
    private String descricao;
    private double preco;
    private Categoria categoria;

    public Prato(String nome,double preco, Categoria categoria, String descricao ) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.descricao = descricao;
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

    String getDescricao() {
        return descricao;
    }
}
