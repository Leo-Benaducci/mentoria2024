package br.com.lbenaducci;

public sealed interface Comida permits Doce, Salgado {
	void preparar();

	default void servir() {
		System.out.println("Servindo...");
	}
}
