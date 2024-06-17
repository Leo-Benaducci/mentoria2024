package br.com.lbenaducci.Classes;

public abstract class Operacao implements Fator, Operador{

    @Override
    public double isEqualTo() {
        return 0;
    }

    protected Operador getOperador(){

    }
}
