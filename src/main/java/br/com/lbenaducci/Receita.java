package br.com.lbenaducci;

import java.util.List;

public abstract class Receita {
	private String autor;
	private List<String> ingredientes;

	protected Receita(String autor, List<String> ingredientes) {
		this.autor = autor;
		this.ingredientes = ingredientes;
	}

	public final String getAutor() {
		return autor;
	}

	public final void setAutor(String autor) {
		this.autor = autor;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public abstract Comida cozinhar();
}
