package br.com.lbenaducci;

public final class Pizza implements Salgado, Doce {
	private final Sabor sabor;

	public Pizza(Sabor sabor) {
		this.sabor = sabor;
	}

	public Sabor getSabor() {
		return sabor;
	}

	@Override
	public void preparar() {
		System.out.println("Preparando pizza de " + sabor.name());
	}

	@Override
	public void addAcucar() {
		if(sabor.isDoce()) {
			System.out.println("Adicionando acucar na pizza");
		}else{
			System.out.println("Nao é possível adicionar acucar na pizza");
		}
	}

	@Override
	public void servir() {
		System.out.println("Servindo pizza");
	}
}
