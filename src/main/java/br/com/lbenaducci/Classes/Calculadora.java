package br.com.lbenaducci.Classes;
import java.util.function.Supplier;

public class Calculadora implements Fator {

    private final Operacao operacaoAtual;

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

    public Calculadora somar(double num) {
        Supplier<Double> num1Supplier = operacaoAtual::isEqualTo;
        Supplier<Double> num2Supplier = () -> num;
        Operacao novaOperacao = new Soma(num1Supplier, num2Supplier);
        return new Calculadora(novaOperacao);
    }

    public Calculadora somar(Operacao operacao) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> operacao.isEqualTo();
        Operacao novaOperacao = new Soma(num1Supplier, num2Supplier);
        return new Calculadora(novaOperacao);
    }

    public Calculadora subtrair(double num) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> num;
        Operacao novaOperacao = new Subtracao(num1Supplier, num2Supplier);
        return new Calculadora(novaOperacao);
    }

    public Calculadora subtrair(Operacao operacao) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> operacao.isEqualTo();
        Operacao novaOperacao = new Subtracao(num1Supplier, num2Supplier);
        return new Calculadora(novaOperacao);

    }

    public Calculadora multiplicar(double num) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> num;
        Operacao novaOperacao = new Multiplicacao(num1Supplier, num2Supplier);
        return new Calculadora(novaOperacao);
    }

    public Calculadora multiplicar(Operacao operacao) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> operacao.isEqualTo();
        Operacao novaOperacao = new Multiplicacao(num1Supplier, num2Supplier);
        return new Calculadora(novaOperacao);
    }

    public Calculadora dividir(double num) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> num;
        Operacao novaOperacao = new Divisao(num1Supplier, num2Supplier);
        return new Calculadora(novaOperacao);
    }

    public Calculadora dividir(Operacao operacao) {
        Supplier<Double> num1Supplier = () -> operacaoAtual.isEqualTo();
        Supplier<Double> num2Supplier = () -> operacao.isEqualTo();
        Operacao novaOperacao = new Divisao(num1Supplier, num2Supplier);
        return new Calculadora(novaOperacao);
    }
}

