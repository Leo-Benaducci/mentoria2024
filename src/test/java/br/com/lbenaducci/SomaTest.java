package br.com.lbenaducci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomaTest {
	@Test
	void construtorTest() {
		Operacao operacao = assertDoesNotThrow(() -> new Soma(() -> 2.0, () -> 3.0));
		assertNotNull(operacao);
		assertInstanceOf(Operacao.class, operacao);
		assertInstanceOf(Fator.class, operacao);

		assertThrows(NullPointerException.class, () -> new Soma(null, () -> 3.0));
		assertThrows(NullPointerException.class, () -> new Soma(() -> 2.0, null));
	}

	@Test
	void isEqualToTest() {
		Operacao operacao = new Soma(() -> 3.0, () -> 2.0);
		assertEquals(5.0, operacao.isEqualTo());
	}
}