package br.com.lbenaducci;

public class Somar extends Operacao {

    public Somar(Fator esquerda, Fator direita) {
        super(esquerda, direita);
    }

    @Override
    protected Operador getOperador() {
        return null;
    }

    }

