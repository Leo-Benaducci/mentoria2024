package br.com.lbenaducci.Classes;

import java.util.function.Supplier;

public abstract class Operacao implements Fator {

    private final Supplier<Double> num1;
    private final Supplier<Double> num2;

    protected Operacao(Supplier<Double> num1, Supplier<Double> num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("Os números não podem ser nulos.");
        }
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double isEqualTo() {
        // Obtém os valores dos suppliers
        double a = num1.get();
        double b = num2.get();

        // Obtém o operador a ser utilizado
        Operador operador = getOperador();

        // Realiza o cálculo utilizando o operador da enumeração Operador
        return operador.calc(a, b);
    }

    protected abstract Operador getOperador(); // Deixei apenas a assinatura, você implementará na subclasse
}






