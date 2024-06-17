package br.com.lbenaducci.Classes;

import java.util.function.Supplier;

public class Operacao implements Fator {

    private Supplier<Double> num1;
    private Supplier<Double> num2;

    public Operacao(Supplier<Double> num1, Supplier<Double> num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Os números não podem ser nulos.");
        }
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double isEqualTo() {
        double resultado = num1.get() + num2.get();
        return resultado;
    }
}


