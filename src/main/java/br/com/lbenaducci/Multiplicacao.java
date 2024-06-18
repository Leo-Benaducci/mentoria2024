package br.com.lbenaducci;

public class Multiplicacao extends Operacao{

    public Multiplicacao(Fator esquerda, Fator direita) {
        super(esquerda, direita);
    }

    @Override
    protected Operador getOperador() {
        return Operador.MULTIPLICACAO;

    }
}
