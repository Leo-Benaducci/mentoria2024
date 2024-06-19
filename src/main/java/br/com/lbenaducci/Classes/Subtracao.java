package br.com.lbenaducci.Classes;

import java.util.function.Supplier;

public class Subtracao extends Operacao {
    public Subtracao(Supplier<Double> num1, Supplier<Double> num2) {
        super(num1, num2);
    }

    @Override
    protected Operador getOperador() {
        return Operador.SUBTRACAO;
    }
}



