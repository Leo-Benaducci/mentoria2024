package br.com.lbenaducci;

public class Calculadora {

    public long somar(long a, long b) {
        long soma = a + b;
        return soma;
    }

    public long subtrair(long a, long b) {
        long subtrair = a - b;
        return subtrair;
    }

    public long multiplicar(long a, long b) {
        long multiplicar = a * b;
        return multiplicar;
    }

    public Double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não pode ser dividido por 0");
        }
        double divisao = a / b;
        return divisao;
    }

    public double media(double... numeros) {
        double soma = 0;

        for (double numero : numeros) {

            soma += numero;
        }

        return soma / numeros.length;
    }

    public int max(int... numeros) {
        int max = numeros[0];

        for (int numentrada : numeros) {
            if (numentrada > max) {
                max = numentrada;
            }
        }
        return max;
    }


    public int min(int... numeros) {
        int min = numeros[0];

        for (int numentrada : numeros) {
            if (numentrada < min) {
                min = numentrada;
            }
        }
        return min;
    }
}
