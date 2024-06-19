package br.com.lbenaducci.Classes;

import java.util.function.Supplier;

public class Soma extends Operacao {
    public Soma(Supplier<Double> num1, Supplier<Double> num2) {
        super(num1, num2);
    }

    @Override
    protected Operador getOperador() {
        return Operador.SOMA;
    }
}




