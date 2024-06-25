package br.com.lbenaducci;

public abstract class Item {

    private final String nome;
    private final double preco;
    private final Categoria categoria;


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

    // Você adicionou a descrição a todos os itens, mas bebidas e combos esse item não era obrigatório
    public abstract String descricao();
}
