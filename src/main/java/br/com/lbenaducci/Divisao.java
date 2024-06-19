package br.com.lbenaducci;

public class Divisao extends Operacao {

    public Divisao(Fator esquerda, Fator direita) {
        super(esquerda, direita);
        if (esquerda == null || direita == null) {
            throw new NullPointerException ("Valor não pode ser nulo.");
        }
    }

    protected Operador getOperador() {
        return Operador.DIVISAO;
    }
}