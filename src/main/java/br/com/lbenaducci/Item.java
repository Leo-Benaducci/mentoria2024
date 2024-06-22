package br.com.lbenaducci;

public abstract class Item {
    private String Nome;
    private double Preco;
    private String Categoria;

    public Item(String Nome, double Preco, String Categoria) {
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

    public String getCategoria() {
        return Categoria;
    }



}
