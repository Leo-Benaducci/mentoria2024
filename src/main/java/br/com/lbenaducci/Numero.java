package br.com.lbenaducci;

public record Numero (
    double valor
        ) implements Fator{


        @Override
        public double isEqualTo() {

                return valor;
        }
}


