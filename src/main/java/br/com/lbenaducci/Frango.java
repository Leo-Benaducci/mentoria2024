package br.com.lbenaducci;

public class Frango<B extends Sabor<B>> implements Sabor<B> {
	public void adicionarCatupiry() {
		System.out.println("Adicionando catupiry");
	}

	public void adicionarBorda(B sabor) {
		System.out.println("Adicionando borda de " + sabor.getClass().getSimpleName());
	}
}
