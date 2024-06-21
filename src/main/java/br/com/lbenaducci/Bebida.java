package br.com.lbenaducci;

public class Bebida extends Item {

    public Bebida(String nome, double preco) {
        super(nome, preco, Categoria.BEBIDA);
    }

    public String descricao(){
        return "Bebida: " + getNome() + ", Preço: " + getPreco();
    }
}
