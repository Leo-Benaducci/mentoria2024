package br.com.lbenaducci;

import java.util.List;

public class ReceitaPizza extends Receita {
	private Sabor sabor;

	public ReceitaPizza(Sabor sabor) {
		super("Italianos", List.of("massa", "queijo", "molho"));
		this.sabor = sabor;
	}

	@Override
	public Comida cozinhar() {
		Pizza pizza = new Pizza(sabor);
		pizza.preparar();
		for(String ingrediente: getIngredientes()) {
			System.out.println("Adicionando "+ ingrediente);
		}
		return pizza;
	}
}
