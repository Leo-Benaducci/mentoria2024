package br.com.lbenaducci;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somar(5,5);
        calc.subtrair(9,8);
        calc.multiplicar(2,10);
        calc.dividir(15,3);
        calc.media(1, 2, 3, 4, 5);
        calc.max(1, 2, 3, 4, 5);
        calc.min(1, 2, 3, 0, 5);

//        System.out.println(calc.getSoma());
//        System.out.println(calc.getSubtracao());
//        System.out.println(calc.getMultiplicacao());
//        System.out.println(calc.getDivisao());
//        System.out.println(calc.getMedia());
//        System.out.println(calc.getMaximo());

        System.out.println(calc.toString());


        Calculadora calc2 = new Calculadora();

        calc.dividir(10,0);

        System.out.println("\n" + calc2.getDivisao());

    }
}

