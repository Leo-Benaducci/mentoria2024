package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PratoTest {
	@Test
	void construtorTest() {
		Prato prato = assertDoesNotThrow(() -> new Prato("Teste", 10.5, Categoria.ENTRADA, "Item de teste"));
		assertInstanceOf(Item.class, prato);
		assertEquals("Teste", prato.getNome());
		assertEquals(10.5, prato.getPreco());
		assertEquals(Categoria.ENTRADA, prato.getCategoria());
		assertEquals("Item de teste", prato.getDescricao());
	}
}