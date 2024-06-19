package br.com.lbenaducci;

public  class Subtracao extends Operacao{

    public Subtracao(Fator esquerda, Fator direita) {
        super(esquerda, direita);
        if (esquerda == null || direita == null) {
            throw new NullPointerException ("Valor não pode ser nulo.");
        }
    }


    protected Operador getOperador() {
        return Operador.SUBTRACAO;
    }
}