package br.com.lbenaducci;

public abstract class Operacao implements Fator{

    private final Fator esquerda;
    private final Fator direita;

    protected Operacao(Fator esquerda, Fator direita) {
        if(esquerda == null || direita == null) {
            throw new NullPointerException("Operação inválida");
        }
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double isEqualTo() {
        return getOperador().calc(esquerda.isEqualTo(), direita.isEqualTo());
    }

    protected abstract Operador getOperador();

    }
