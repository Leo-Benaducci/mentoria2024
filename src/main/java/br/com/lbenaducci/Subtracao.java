package br.com.lbenaducci;

public class Subtracao extends Operacao implements Fator {

    public Subtracao(Fator esquerda, Fator direita) {
        super(esquerda, direita);
    }


    @Override
    protected Operador getOperador() {
        return Operador.SUBTRACAO;
    }

    @Override
    public double isEqualTo() {
        return super.isEqualTo();
    }
}
