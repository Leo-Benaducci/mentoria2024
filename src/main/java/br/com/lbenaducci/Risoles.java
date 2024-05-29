package br.com.lbenaducci;

public final class Risoles implements Salgado {
	private Sabor sabor;

	public Risoles(Sabor sabor) {
		this.sabor = sabor;
	}

	@Override
	public void preparar() {
		System.out.println("Preparando risoles de " + sabor.name());
	}
}
