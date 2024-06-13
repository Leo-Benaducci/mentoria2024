package br.com.lbenaducci;

public class Divisao extends Operacao{

    public Divisao(Fator esquerda, Fator direita) {
        super(esquerda, direita);
    }

    @Override
    protected Operador getOperador() {
        return null;
    }

}
