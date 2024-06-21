package br.com.lbenaducci;

public class Prato extends Item{

    private final String descricao;

    public Prato(String nome, double preco, Categoria categoria, String descricao) {
        super(nome, preco, categoria.ENTRADA);
        this.descricao = descricao;
    }

    @Override
    public String descricao() {
        return "Prato: " + getNome() + ", Preço: " + getPreco() + ", Descrição: " + descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
