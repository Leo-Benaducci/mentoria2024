package br.com.lbenaducci;

public enum Operador  {
    SOMA{
        @Override
        public double calc(double a, double b) {
            return a + b;
        }
    },
    SUBTRACAO{
        public double calc(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICACAO{
        public double calc(double a, double b) {
            return a * b;
        }
    },
    DIVISAO{
        public double calc(double a, double b) {
            if(b ==0){
                throw new NullPointerException("Impossivel dividir por 0");
            }
                return a / b;
        }
    };


    public abstract double calc(double a, double b);
}
