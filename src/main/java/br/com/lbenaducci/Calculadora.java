package br.com.lbenaducci;

public class Calculadora {
    public long somar(long a, long b) {
        return a + b;
    }

    public long subtrair(long a, long b) {
        return a - b;
    }

    public long multiplicar(long a, long b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("não pode dividir por zero");
        }
        return a / b;
    }

    public double media(double... arg) {
        double soma = 0;

        for (double a : arg) {
            soma = soma + a;
        }
        return soma / arg.length;
    }

    public int max(int... arg) {
        int maior = arg[0];
        for (int comp : arg) {
            if (comp > maior) {
                maior = comp;
            }
        }
        return maior;
    }

    public int min(int... arg) {
        int menor = arg[0];
        for (int comp : arg) {
            if (comp < menor) {
                menor = comp;
            }
        }
        return menor;
    }
}