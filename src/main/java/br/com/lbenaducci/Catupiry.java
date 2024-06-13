package br.com.lbenaducci;

public class Catupiry implements Sabor<Catupiry>{
	@Override
	public void adicionarBorda(Catupiry catupiry) {
		System.out.println("Adicionando borda");
	}
}
