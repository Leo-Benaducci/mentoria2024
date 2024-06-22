package br.com.lbenaducci;

public abstract class Item {
    private final String Nome;
    private final double Preco;
    private final Categoria Categoria;

    public Item(String Nome, double Preco, Categoria Categoria) {
        this.Nome = Nome;
        this.Preco = Preco;
        this.Categoria = Categoria;
    }

    public String getNome() {
        return Nome;
    }

    public double getPreco(){
        return Preco;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    @Override
    public String toString() {
        return Nome + " (" + Categoria + "): R$ " + Preco;
    }
}
