package br.com.lbenaducci;

public enum Sabor {
	CALABRESA(false),
	FRANGO(false),
	FILE_AO_ALHO(false),
	BRIGADEIRO(true);

	private final boolean doce;

	Sabor(boolean doce) {
		this.doce = doce;
	}

	public boolean isDoce() {
		return doce;
	}
}
