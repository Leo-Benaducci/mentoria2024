package br.com.lbenaducci;

public class Divisao extends Operacao implements Fator {

    public Divisao(Fator esquerda, Fator direita) {
        super(esquerda, direita);
    }


    @Override
    protected Operador getOperador() {
        return Operador.DIVISAO;
    }

    @Override
    public double isEqualTo() {
        return super.isEqualTo();
    }
}
