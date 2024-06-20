package br.com.lbenaducci;

public class Bebida extends Item{
    private final String nome;
    private final double preco;
    private final Categoria categoria;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = Categoria.BEBIDA;
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
}
