package br.com.lbenaducci.Classes;
import java.util.function.Supplier;

public class Calculadora implements Fator {

    private Operacao operacaoAtual;

    public Calculadora(Operacao operacaoInicial) {
        if (operacaoInicial == null) {
            throw new NullPointerException("Operacao inicial nao pode ser nula");
        }
        this.operacaoAtual = operacaoInicial;
    }

    @Override
    public double isEqualTo() {
        return operacaoAtual.isEqualTo();
    }

    public double somar(double num) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> num;
        operacaoAtual = new Operacao(num1Supplier, num2Supplier) {
            @Override
            protected Operador getOperador() {
                return Operador.SOMA;
            }
        };
        return operacaoAtual.isEqualTo();
    }

    public Calculadora subtrair(double num) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> num;
        operacaoAtual = new Operacao(num1Supplier, num2Supplier) {
            @Override
            protected Operador getOperador() {
                return Operador.SUBTRACAO;
            }
        };
        return this;
    }

    public Calculadora multiplicar(double num) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> num;
        operacaoAtual = new Operacao(num1Supplier, num2Supplier) {
            @Override
            protected Operador getOperador() {
                return Operador.MULTIPLICACAO;
            }
        };
        return this;
    }

    public Calculadora dividir(double num) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> num;
        operacaoAtual = new Operacao(num1Supplier, num2Supplier) {
            @Override
            protected Operador getOperador() {
                return Operador.DIVISAO;
            }
        };
        return this;
    }
}






