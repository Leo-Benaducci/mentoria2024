package br.com.lbenaducci;

public class Subtracao extends Operacao{

    public Subtracao(Fator esquerda, Fator direita) {
        super(esquerda, direita);
    }

    @Override
    protected Operador getOperador() {
        return null;
    }

}
