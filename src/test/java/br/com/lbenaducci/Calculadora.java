package br.com.lbenaducci;

public class Calculadora {

    private Long soma;
    private Long subtracao;
    private Long multiplicacao;
    private Double divisao;
    private Double media;
    private Double somaMedia = null;
    private Integer maximo;
    private Integer minimo;

    public long somar(long a, long b) {
        soma = a + b;
        return soma;
    }

    public long subtrair(long a, long b) {
        subtracao = a - b;
        return subtracao;
    }

    public long multiplicar(long a, long b) {
        multiplicacao = a * b;
        return multiplicacao;
    }

    public double dividir(double a, double b) {
        divisao = a / b;
        if (b == 0) {
            throw new IllegalArgumentException("O Segundo numero não pode ser zero.");
        }
        return divisao;
    }

    public double media(double... nums) {
        somaMedia = 0D;
        for (double num : nums) {
            somaMedia += num;
        }
        media = somaMedia / nums.length;
        return media;
    }

    public int max(int... nums) {
        maximo = nums[0];
        for (int num : nums) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    public int min(int... nums) {
        minimo = nums[0];
        for (int num : nums) {
            if (num < minimo) {
                minimo = num;
            }
        }
        return minimo;
    }

    public Long getSoma() {
        return soma;
    }

    public void setSoma(Long soma) {
        this.soma = soma;
    }

    public Long getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(Long subtracao) {
        this.subtracao = subtracao;
    }

    public Long getMultiplicacao() {
        return multiplicacao;
    }

    public void setMultiplicacao(Long multiplicacao) {
        this.multiplicacao = multiplicacao;
    }

    public Double getDivisao() {
        return divisao;
    }

    public void setDivisao(Double divisao) {
        this.divisao = divisao;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getSomaMedia() {
        return somaMedia;
    }

    public void setSomaMedia(Double somaMedia) {
        this.somaMedia = somaMedia;
    }

    public Integer getMaximo() {
        return maximo;
    }

    public void setMaximo(Integer maximo) {
        this.maximo = maximo;
    }

    public Integer getMinimo() {
        return minimo;
    }

    public void setMinimo(Integer minimo) {
        this.minimo = minimo;
    }

    @Override
    public String toString() {
        return "Calculadora: \n" +
                "Soma= " + soma + "\n" +
                "Subtração= " + subtracao + "\n" +
                "Multiplicação= " + multiplicacao + "\n" +
                "Divisão= " + divisao + "\n" +
                "Média= " + media + "\n" +
                "Máximo= " + maximo + "\n" +
                "Mínimo= " + minimo;
    }
}
