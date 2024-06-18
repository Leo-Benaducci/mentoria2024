package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BebidaTest {
	@Test
	void construtorTest() {
		Bebida bebida = assertDoesNotThrow(() -> new Bebida("Teste", 10.5));
		assertInstanceOf(Item.class, bebida);
		assertEquals("Teste", bebida.getNome());
		assertEquals(10.5, bebida.getPreco());
		assertEquals(Categoria.BEBIDA, bebida.getCategoria());
	}
}