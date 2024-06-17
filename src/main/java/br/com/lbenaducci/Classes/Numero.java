package br.com.lbenaducci.Classes;

public record Numero (double valor) implements Fator {

    @Override
    public double isEqualTo() {
        return valor;
    }
}
