package br.com.lbenaducci;

public class Soma extends Operacao implements Fator {

    public Soma(Fator esquerda, Fator direita) {
        super(esquerda, direita);
    }


    @Override
    protected Operador getOperador() {
        return Operador.SOMA;
    }

    @Override
    public double isEqualTo() {
        return super.isEqualTo();
    }
}
