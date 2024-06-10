package br.com.lbenaducci;

public abstract class Operacao implements Fator {

    public Operacao(Fator operador, Fator operador1) {
    }

    protected abstract Operador getOperador();

    protected Operador getOperador(Fator operador, Fator operador1){
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
