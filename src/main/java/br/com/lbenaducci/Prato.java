package br.com.lbenaducci;

public class Prato extends Item{
    private final String Descricao;

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
