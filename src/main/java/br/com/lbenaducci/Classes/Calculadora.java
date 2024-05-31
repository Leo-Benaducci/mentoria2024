package br.com.lbenaducci.Classes;

public class Calculadora {
    private double somar;


    public double getSomar() {return somar;}

    public void setSomar(double somar) {
        this.somar = somar;
    }

    public Object somar(double n) {
        return n * n;
    }
}
