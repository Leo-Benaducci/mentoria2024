package br.com.lbenaducci;

public abstract class Item {

    private String nome;
    private double preco;
    private Categoria categoria;


    public Item(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public abstract String descricao();
}
