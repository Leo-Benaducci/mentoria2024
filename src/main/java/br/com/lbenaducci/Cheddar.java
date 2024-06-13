package br.com.lbenaducci;

public class Cheddar implements Sabor<Cheddar>{
	@Override
	public void adicionarBorda(Cheddar sabor) {
		System.out.println("Adicionando borda");
	}
}
