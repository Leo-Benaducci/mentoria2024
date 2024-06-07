package br.com.lbenaducci;

public class Operacao implements Fator {



    protected abstract double getOperador();

    protected Operador getOperador(Operador operador, Operador operador1){
        if(operador == null || operador1 == null){
            throw new NullPointerException("Opera nulo não permitido");
        }
        return Operador.SOMA;
    }

    @Override
    public double isEqualTo() {
        return 0;
    }
}
