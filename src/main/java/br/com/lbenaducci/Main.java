package br.com.lbenaducci;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Frango<?>> frangos = doSomesing(new Frango<>());
		System.out.println(frangos);
		Pizza<Frango<Cheddar>, Cheddar> pizza = new Pizza<>(new Frango<Cheddar>());
		pizza.getSabor().adicionarCatupiry();

		Pizza<Calabresa<Catupiry>, Catupiry> pizza2 = new Pizza<>(new Calabresa<Catupiry>());
		pizza2.getSabor().addicionarAzeitona();

		//		Pizza<Bicicleta, Catupiry> pizza3 = new Pizza<>(new Bicicleta()); //n funciona
	}

	public static <T> List<T> doSomesing(T t) {
		System.out.println(t);
		return List.of(t);
	}
}