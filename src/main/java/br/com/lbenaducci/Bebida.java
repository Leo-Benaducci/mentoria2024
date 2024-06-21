package br.com.lbenaducci;

public class Bebida extends Item{
    private String nome;
    private String descricao;
    private double preco;
    private Categoria categoria;

    public  Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = Categoria.BEBIDA;

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
}
