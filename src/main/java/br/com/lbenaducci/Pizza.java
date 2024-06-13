package br.com.lbenaducci;

public class Pizza<S extends Sabor<B>, B extends Sabor<B>> {
	private S sabor;

	public Pizza(S sabor) {
		this.sabor = sabor;
	}

	public S getSabor() {
		return sabor;
	}
}
