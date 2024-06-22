package br.com.lbenaducci;

public abstract class Item {
    private String Nome;
    private double Preco;
    private Categoria Categoria;

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
