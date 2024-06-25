package br.com.lbenaducci;

/*
Isso é meramente uma interface criado como classe abstrata, o que mostra que não entendeu a diferença entre a classe abstrata e interface.
A classe abstrata pode conter atributos e métodos, não para ter apenas métodos abstratos.
 */
public abstract class Item {
    abstract String getNome();
    abstract double getPreco();
    abstract Categoria getCategoria();
}
