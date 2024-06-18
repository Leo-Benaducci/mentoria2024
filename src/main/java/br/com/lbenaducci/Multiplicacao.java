package br.com.lbenaducci;

public class Multiplicacao extends Operacao implements Fator {

    public Multiplicacao(Fator esquerda, Fator direita) {
        super(esquerda, direita);
    }


    @Override
    protected Operador getOperador() {
        return Operador.MULTIPLICACAO;
    }

    @Override
    public double isEqualTo() {
        return super.isEqualTo();
    }
}
