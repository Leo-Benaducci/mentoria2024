package br.com.lbenaducci;

public class Prato extends Item{
    private final String Descricao;

    // Não está usando a categoria passada no construtor, esta definindo que todos os pratos são entrada independente da categoria
    // Voce só quis passar nos testes, não pensou na regra de negócio de um restaurante.
    public Prato(String Nome, double Preco, Categoria entrada, String Descricao) {
        super(Nome, Preco, Categoria.ENTRADA);
        this.Descricao = Descricao;
    }

    public String getDescricao() {
        return Descricao;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + Descricao;
    }
}
