package br.com.lbenaducci;

public  class Soma extends Operacao {

    public Soma(Fator esquerda, Fator direita) {
        super(esquerda, direita);
        if (esquerda == null || direita == null) {
            throw new NullPointerException ("Valor não pode ser nulo.");
        }
    }

    protected Operador getOperador() {
        return Operador.SOMA;
    }
}