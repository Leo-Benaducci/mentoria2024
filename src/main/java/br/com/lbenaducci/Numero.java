package br.com.lbenaducci;

public record Numero (
    double fator
        )implements Fator {


        @Override
        public double isEqualTo() {
                return fator;
        }
}


