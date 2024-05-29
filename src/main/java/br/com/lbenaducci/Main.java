package br.com.lbenaducci;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		Comida c = new Risoles(Sabor.FRANGO);
		if(new Random().nextBoolean()) {
			Receita r = new ReceitaPizza(Sabor.BRIGADEIRO);
			c = r.cozinhar();
		}
		if(c instanceof Doce doce) {
			doce.addAcucar();
		}
		if(c instanceof Pizza pizza) {
			switch(pizza.getSabor()) {
				case BRIGADEIRO -> pizza.addAcucar();
				case CALABRESA -> pizza.servir();
				default -> System.out.println("Nada a fazer");
			}
		}
		c.preparar();
		c.servir();
	}
}