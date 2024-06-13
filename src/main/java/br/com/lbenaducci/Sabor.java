package br.com.lbenaducci;

public interface Sabor<S extends Sabor<S>> {
	void adicionarBorda(S sabor);
}
