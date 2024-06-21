package br.com.lbenaducci;

public class Prato extends Item{

    private String descricao;

    public Prato(String nome, double preco, String categoria, String descricao) {
        super(nome, preco, categoria);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
