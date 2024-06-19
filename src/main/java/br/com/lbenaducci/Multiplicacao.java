package br.com.lbenaducci;

public class Multiplicacao extends Operacao{

    public Multiplicacao(Fator esquerda, Fator direita) {
        super(esquerda, direita);
        if (esquerda == null || direita == null) {
            throw new NullPointerException ("Valor não pode ser nulo.");
        }
    }

    protected Operador getOperador() {
        return Operador.MULTIPLICACAO;
    }
}