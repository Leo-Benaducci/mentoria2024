package br.com.lbenaducci;

public class Calculadora {

    public long somar(int i, int i1) {

        return i + i1;
    }

    public long subtrair(int i, int i1) {
        return i - i1;
    }

    public long multiplicar(int i, int i1) {
        return (long) i * i1;
    }

    public double dividir(double i, double i1) {
        if(i1 == 0){
            throw new IllegalArgumentException("Não é possível dividir por zero");
        } else{ return i / i1;
        }
    }

    public double media(double... numeros) {
        double CalculaMedia= 0;
        for (Double numero : numeros) {
            CalculaMedia += numero;

            //Explicação abaixo:
            // CalculaMedia = CalculaMedia + numero;
        }
        return CalculaMedia / numeros.length;

    }

    public int max(int... numeros) {
        int Numeromaximo = numeros[0];
        for (int numero : numeros) {
            if (numero > Numeromaximo) {
                Numeromaximo = numero;
            }
        }
        return Numeromaximo;
    }

    public int min(int... numeros) {
        int NumeroMinimo = numeros[0];
        for(int numero : numeros) {
            if (numero < NumeroMinimo) {
                NumeroMinimo = numero;
            }
        }
        return  NumeroMinimo;
    }
}



