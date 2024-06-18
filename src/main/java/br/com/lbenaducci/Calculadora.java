package br.com.lbenaducci;

public class Calculadora implements Fator {



    public Calculadora(Soma somar) {
        if(somar == null){
            throw new NullPointerException("Operacao não pode ser nula");
        }
    }

    @Override
    public double isEqualTo() {
        return isEqualTo();
    }
}
