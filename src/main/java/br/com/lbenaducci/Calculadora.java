package br.com.lbenaducci;

public class Calculadora {
    public long somar(long n1, long n2){
        return n1 + n2;
    }
    public long subtrair(long n1, long n2){
        return n1 - n2;
    }
    public long multiplicar(long n1, long n2){
        return n1 * n2;
    }
    public double dividir(double n1, double n2){
        if(n2==0){
            throw new IllegalArgumentException("Não da pra dividir 0 com 0 ne");
        }
        return n1 / n2;
    }
    public double media(double ... num) {
        double nMedia = 0;
        for (double num1 : num) {
            nMedia += num1;
        }
        return nMedia / num.length;
    }
    public int max(int ... num) {
        int nMax = 0;
        for (int num1 : num) {
            if (num1 > nMax) {
                nMax =  num1;
            }
        }
        return nMax;
    }
    public int min(int ... num) {
        int nMin = 0;
        for (int num1 : num) {
            if (num1 < nMin) {
                nMin = num1;
            }
        }
        return nMin;
    }
}
