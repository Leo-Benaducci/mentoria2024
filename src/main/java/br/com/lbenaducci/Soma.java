package br.com.lbenaducci;

public class Soma extends Operacao {

    public Soma(Fator esquerda, Fator direita) {
        super(esquerda, direita);
    }

    @Override
    protected Operador getOperador() {
        return Operador.SOMA;
    }

}