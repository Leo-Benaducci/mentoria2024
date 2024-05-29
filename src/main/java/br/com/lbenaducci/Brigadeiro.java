package br.com.lbenaducci;

public record Brigadeiro(
		String cobertura
) implements Doce {
	@Override
	public void preparar() {
		System.out.println("Preparando brigadeiro");
	}

	@Override
	public void addAcucar() {
		System.out.println("Adicionando acucar");
	}
}