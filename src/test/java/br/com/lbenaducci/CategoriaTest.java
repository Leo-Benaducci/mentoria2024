package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CategoriaTest {
	@Test
	void valuesTest() {
		List<String> categoriasNomes = getCategoriasNomes();
		List.of("ENTRADA", "PRINCIPAL", "SOBREMESA", "BEBIDA", "COMBO")
		    .forEach(categoria -> assertTrue(categoriasNomes.contains(categoria)));
	}

	private List<String> getCategoriasNomes() {
		Categoria[] categorias = Categoria.values();
		List<String> categoriasNome = new ArrayList<>();
		for(Categoria c: categorias) {
			categoriasNome.add(c.name());
		}
		return categoriasNome;
	}
}