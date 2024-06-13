package br.com.lbenaducci;

public class Calabresa<B extends Sabor<B>> implements Sabor<B> {
	public void addicionarAzeitona() {
		System.out.println("Adicionando azeitona");
	}

	@Override
	public void adicionarBorda(B sabor) {
		System.out.println("Adicionando borda de " + sabor.getClass().getSimpleName());
	}
}
