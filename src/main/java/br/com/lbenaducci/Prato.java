package br.com.lbenaducci;

public class Prato extends Item{

    private final String descricao;

    // Não está usando a categoria passada no construtor, esta definindo que todos os pratos são entrada independente da categoria
    // Voce só quis passar nos testes, não pensou na regra de negócio de um restaurante.
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
