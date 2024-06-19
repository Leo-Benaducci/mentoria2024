package br.com.lbenaducci;

public record Numero( double numero) implements Fator {

    @Override
    public double isEqualTo() {
        return numero;
    }
}