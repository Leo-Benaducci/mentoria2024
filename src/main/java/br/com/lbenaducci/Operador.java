package br.com.lbenaducci;

public enum Operador {

    SOMA{

        public double calc(double a, double b) {
            return a + b;
        }
    },
    SUBTRACAO{

        public double calc(double a, double b) {
            return a - b;
        }
    },
    DIVISAO {
        public double calc(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Não Divide por 0");
            }
            {
                return a / b;
            }
        }
    },
    MULTIPLICACAO {
        public double calc(double a, double b) {
            return a * b;
        }
    };

    public abstract double calc(double a, double b);

}
