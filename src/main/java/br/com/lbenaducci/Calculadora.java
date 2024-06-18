package br.com.lbenaducci;

public class Calculadora implements Fator {


    private Operacao operacao;

    public  Calculadora(Operacao operacao) {
        if(operacao == null){
            throw new NullPointerException("Operacao não pode ser nula");
        }
        this.operacao = operacao;
    }

    @Override
    public double isEqualTo() {
        return operacao.isEqualTo();
    }

    public Calculadora somar(double valor){
       return new Calculadora(new Soma(new Numero(this.isEqualTo()), new Numero(valor)));
    }

    public Calculadora somar(Operacao operacao){
        return new Calculadora(new Soma(new Numero(this.isEqualTo()), new Numero(operacao.isEqualTo())));
    }

    public Calculadora subtrair(double valor){
        return new Calculadora(new Subtracao(new Numero(this.isEqualTo()), new Numero(valor)));
    }


    public Calculadora subtrair(Operacao operacao){
        return new Calculadora(new Subtracao(new Numero(this.isEqualTo()), new Numero(operacao.isEqualTo())));
    }

    public Calculadora multiplicar(double valor){
        return new Calculadora(new Multiplicacao(new Numero(this.isEqualTo()), new Numero(valor)));
    }


    public Calculadora multiplicar(Operacao operacao){
        return new Calculadora(new Multiplicacao(new Numero(this.isEqualTo()), new Numero(operacao.isEqualTo())));
    }

    public Calculadora dividir(double valor){
        if (valor == 0){
            throw new IllegalArgumentException("Divisão por 0 proibida");
        }
        return new Calculadora(new Divisao(new Numero(this.isEqualTo()), new Numero(valor)));
    }


    public Calculadora dividir(Operacao operacao){
        return new Calculadora(new Divisao(new Numero(this.isEqualTo()), new Numero(operacao.isEqualTo())));
    }


}
